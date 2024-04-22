package es.mde.repositorios;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import es.mde.externas.Proyector;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Transactional
public class ProyectorDAOImpl implements ProyectorDAOCustom{
  @Autowired
  ProyectorDAO proyectorDAO;
  @PersistenceContext
  EntityManager entityManager;
  
  @Override
  public List<Proyector> getProyectoresDistanciaMinima(double distanciaMinima) {
    List<Proyector> proyectores = new ArrayList<Proyector>();
    proyectorDAO.findAll().forEach(p ->{
      if (p.getDistanciaMaxima() >= distanciaMinima) {
        proyectores.add(p);
      }
    });
    return proyectores;
  }

}
