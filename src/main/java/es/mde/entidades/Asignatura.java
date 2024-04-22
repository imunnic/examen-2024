package es.mde.entidades;

import java.time.Instant;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ASIGNATURAS")
public class Asignatura {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nombre;
  private Instant inicio;
  private Instant fin;
  private boolean english;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "PROFESOR")
  private Profesor profesor;
  
  public Asignatura() {
  }
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public String getNombre() {
    return nombre;
  }
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public Instant getInicio() {
    return inicio;
  }
  
  public void setInicio(Instant inicio) {
    this.inicio = inicio;
  }
  
  public boolean isEnglish() {
    return english;
  }
  
  public void setEnglish(boolean english) {
    this.english = english;
  }
  
  public Instant getFin() {
    return fin;
  }
  
  public void setFin(Instant fin) {
    this.fin = fin;
  }
  
  public Profesor getProfesor() {
    return profesor;
  }
  
  public void setProfesor(Profesor profesor) {
    this.profesor = profesor;
  }

}
