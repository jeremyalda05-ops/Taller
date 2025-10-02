package taller;

public class Ave extends Animal implements Volador {
	private String razaAve;

	public Ave(String nombre, int edad, String razaAve) {
		super(nombre, edad);
		this.razaAve = razaAve;
	}

	public String getRazaAve() {
		return razaAve;
	}

	public void setRazaAve(String razaAve) {
		this.razaAve = razaAve;
	}

	@Override
	public void volar() {
		System.out.println(getNombre() + " está volando.");
	}

	@Override
	public void emitirSonido() {
		System.out.println("¡Pio Pio Pio es lo Mio!");

	}
}
