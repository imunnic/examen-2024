package es.mde.rest;

import java.util.List;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import es.mde.entidades.Profesor;
import es.mde.externas.Proyector;
import es.mde.repositorios.ProyectorDAO;

@RepositoryRestController

public class ProyectorController {

  private ProyectorDAO proyectorDAO;

  public ProyectorController(ProyectorDAO proyectorDAO) {
    this.proyectorDAO = proyectorDAO;
  }

  @GetMapping("proyectores/search/por-alcance-minimo")
  @ResponseBody
  public CollectionModel<PersistentEntityResource> getProyectoresDistanciaMinima(
      @RequestParam("alcanceMinimo") double alcance, PersistentEntityResourceAssembler assembler) {
    List<Proyector> proyectores = proyectorDAO.getProyectoresDistanciaMinima(alcance);
    return assembler.toCollectionModel(proyectores);
  }

}
