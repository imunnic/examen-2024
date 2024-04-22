package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.RequestParam;
import es.mde.entidades.Profesor;
import java.util.List;


@RepositoryRestResource(path = "profesores", itemResourceRel = "profesor",
    collectionResourceRel = "profesores")
public interface ProfesorDAO extends JpaRepository<Profesor, Long>, ProfesorDAOCustom {
  @RestResource(path = "por-area")
  List<Profesor> findByAreaIgnoreCaseContaining(@RequestParam(name = "area") String texto);
}
