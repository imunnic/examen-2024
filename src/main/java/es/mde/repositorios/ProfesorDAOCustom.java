package es.mde.repositorios;

import java.util.List;
import es.mde.entidades.Profesor;

public interface ProfesorDAOCustom {
  List<Profesor> getProfesoresBilingue();
  List<Profesor> getProfesoresAsignaturasEspanol();
  List<Profesor> getProfesoresNoBilingue();
}
