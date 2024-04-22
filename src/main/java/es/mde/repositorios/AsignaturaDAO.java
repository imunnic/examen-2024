package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import es.mde.entidades.Asignatura;

@RepositoryRestResource(path = "asignaturas", itemResourceRel = "asignatura", collectionResourceRel = "asignaturas")
public interface AsignaturaDAO extends JpaRepository<Asignatura, Long>{

}
