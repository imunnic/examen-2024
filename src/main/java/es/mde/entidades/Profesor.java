package es.mde.entidades;

import java.time.Instant;

public class Profesor {

	private String nombre;
	private String correo;
	private Instant fechaInicioContrato;
	private boolean masculino;
	private String area;
	private boolean casado;

	public Profesor() {
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

}
