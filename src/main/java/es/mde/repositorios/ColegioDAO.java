package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import es.mde.entidades.Colegio;

@RepositoryRestResource(path = "colegios", itemResourceRel = "colegio", collectionResourceRel = "colegios")
public interface ColegioDAO extends JpaRepository<Colegio, Long>{

}
