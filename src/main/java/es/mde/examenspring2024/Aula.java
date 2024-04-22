package es.mde.examenspring2024;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import es.mde.externas.Proyector;

@Component("Aula")
public class Aula {
  private Proyector proyector;
  
  public Proyector getProyector() {
    return proyector;
  }
  
  public void setProyector(Proyector proyector) {
    this.proyector = proyector;
  }
  
  @Autowired
  public Aula() {
  }
}
