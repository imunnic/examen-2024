package es.mde.entidades;

import java.time.Instant;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "PROFESORES")
public class Profesor {
  @Id
  @Column(name = "ID_PROFESOR")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nombre;
  private String correo;
  @Column(name = "FECHA_INICIO")
  private Instant fechaInicioContrato;
  private transient boolean masculino;
  private String area;
  private boolean casado;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "COLEGIO")
  private Colegio colegio;
  @OneToMany(mappedBy = "profesor")
  private List<Asignatura> asignaturas;

  public Profesor() {}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Colegio getColegio() {
    return colegio;
  }

  public void setColegio(Colegio colegio) {
    this.colegio = colegio;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public Instant getFechaInicioContrato() {
    return fechaInicioContrato;
  }

  public void setFechaInicioContrato(Instant fechaInicioContrato) {
    this.fechaInicioContrato = fechaInicioContrato;
  }

  public boolean isMasculino() {
    return masculino;
  }

  public void setMasculino(boolean masculino) {
    this.masculino = masculino;
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public boolean isCasado() {
    return casado;
  }

  public void setCasado(boolean casado) {
    this.casado = casado;
  }
  
  public List<Asignatura> getAsignaturas() {
    return asignaturas;
  }
  
  public void setAsignaturas(List<Asignatura> asignaturas) {
    this.asignaturas = asignaturas;
  }
}
