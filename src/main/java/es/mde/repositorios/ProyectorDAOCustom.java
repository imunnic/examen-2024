package es.mde.repositorios;

import java.util.List;
import es.mde.externas.Proyector;

public interface ProyectorDAOCustom {
  List<Proyector> getProyectoresDistanciaMinima(double distanciaMinima);
}
