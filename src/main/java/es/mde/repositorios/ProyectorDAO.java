package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import es.mde.externas.Proyector;

@RepositoryRestResource(path = "proyectores", itemResourceRel = "proyector", collectionResourceRel = "proyectores")
public interface ProyectorDAO extends JpaRepository<Proyector, Long>{
  
  @RestResource(exported = false)
  void delete(Proyector entity);
}
