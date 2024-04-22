package es.mde.repositorios;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import es.mde.entidades.Asignatura;
import es.mde.entidades.Profesor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Transactional
public class ProfesorDAOImpl implements ProfesorDAOCustom{
  
  @Autowired
  ProfesorDAO profesorDAO;
  @PersistenceContext
  EntityManager entityManager;
  
  @Override
  public List<Profesor> getProfesoresBilingue() {
    List<Profesor> profesores = new ArrayList<Profesor>();
    for (Profesor profesor : profesorDAO.findAll()) {
      for (Asignatura asignatura : profesor.getAsignaturas()) {
        if (asignatura.isEnglish()) {
          profesores.add(profesor);
          break;
        }
      }
    }
    return profesores;
  }

  @Override
  public List<Profesor> getProfesoresAsignaturasEspanol() {
    List<Profesor> profesores = new ArrayList<Profesor>();
    for (Profesor profesor : profesorDAO.findAll()) {
      for (Asignatura asignatura : profesor.getAsignaturas()) {
        if (!asignatura.isEnglish()) {
          profesores.add(profesor);
          break;
        }
      }
    }
    return profesores;
  }

  @Override
  public List<Profesor> getProfesoresNoBilingue() {
    List<Profesor> profesores = new ArrayList<Profesor>();
    for (Profesor profesor : profesorDAO.findAll()) {
      boolean bilingue = false;
      for (Asignatura asignatura : profesor.getAsignaturas()) {
        if (asignatura.isEnglish()) {
          bilingue =true;
          break;
        }
      }
      if(!bilingue) {
        profesores.add(profesor);
      }
    }
    return profesores;
  }

}
