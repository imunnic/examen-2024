package es.mde.entidades;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "COLEGIO")
public class Colegio {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nombre;
  private boolean bilingue;
  @OneToMany(mappedBy = "colegio")
  private List<Profesor> profesores;

  public Colegio() {}

  
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public List<Profesor> getProfesores() {
    return profesores;
  }


  public void setProfesores(List<Profesor> profesores) {
    this.profesores = profesores;
  }


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public boolean isBilingue() {
    return bilingue;
  }

  public void setBilingue(boolean bilingue) {
    this.bilingue = bilingue;
  }

}
