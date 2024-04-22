package es.mde.rest;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class MixIns {
  
  public static interface Asignaturas{
    @JsonProperty("inicioAsignatura")
    Instant getInicio();
    @JsonProperty("finAsignatura")
    Instant getFin();
  }
  @JsonPropertyOrder({"correo", "nombre", "fechaInicioContrato", "area"})
  public static interface Profesores{
    @JsonIgnore
    boolean isCasado();
  }

}
