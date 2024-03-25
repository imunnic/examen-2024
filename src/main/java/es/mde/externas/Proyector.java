package es.mde.externas;

public class Proyector {

	private Long id;
	private double herzios;
	private double distanciaMaxima;

	public Proyector() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getHerzios() {
		return herzios;
	}

	public void setHerzios(double herzios) {
		this.herzios = herzios;
	}

	public double getDistanciaMaxima() {
		return distanciaMaxima;
	}

	public void setDistanciaMaxima(double distanciaMaxima) {
		this.distanciaMaxima = distanciaMaxima;
	}
}
