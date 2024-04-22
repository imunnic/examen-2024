package es.mde.rest;

import java.util.List;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import es.mde.entidades.Profesor;
import es.mde.repositorios.ProfesorDAO;

@RepositoryRestController
public class ProfesorController {
  
  private ProfesorDAO profesorDAO;
  
  public ProfesorController(ProfesorDAO profesorDAO) {
    this.profesorDAO = profesorDAO;
  }
  
  @GetMapping("/profesores/search/bilingües")
  @ResponseBody
  public CollectionModel<PersistentEntityResource> getProfesoresBilingue(PersistentEntityResourceAssembler assembler){
    List<Profesor> profesores = profesorDAO.getProfesoresBilingue();
    return assembler.toCollectionModel(profesores);
  }

  @GetMapping("/profesores/search/en-spanish")
  @ResponseBody
  public CollectionModel<PersistentEntityResource> getProfesoresAsignaturasEspanol(PersistentEntityResourceAssembler assembler){
    List<Profesor> profesores = profesorDAO.getProfesoresAsignaturasEspanol();
    return assembler.toCollectionModel(profesores);
  }
  
  @GetMapping("/profesores/search/no-bilingues")
  @ResponseBody
  public CollectionModel<PersistentEntityResource> getProfesoresNoBilingue(PersistentEntityResourceAssembler assembler){
    List<Profesor> profesores = profesorDAO.getProfesoresNoBilingue();
    return assembler.toCollectionModel(profesores);
  }
  
}
