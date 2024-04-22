package es.mde.repositorios;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import es.mde.entidades.Asignatura;

@RepositoryRestResource(path = "asignaturas", itemResourceRel = "asignatura",
    collectionResourceRel = "asignaturas")
public interface AsignaturaDAO extends JpaRepository<Asignatura, Long> {
  @RestResource(path = "por-nombre")
  List<Asignatura> findByNombre(String nombre);
}
