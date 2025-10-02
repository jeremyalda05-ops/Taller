package taller;

public class Avion implements Volador {
	private String modelo;
	private String fabricante;
	private String piloto;
	public Avion(String modelo, String fabricante, String piloto) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.piloto = piloto;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}

	@Override
	public void volar() {
		System.out.println("Ya está volando.");
	}
}