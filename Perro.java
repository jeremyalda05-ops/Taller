package taller;

public class Perro extends Animal {
	private String razaperro;

	public Perro(String nombre, int edad, String razaperro) {
		super(nombre, edad);
		this.razaperro = razaperro;
	}

	public String getRazaperro() {
		return razaperro;
	}

	public void setRazaperro(String razaperro) {
		this.razaperro = razaperro;
	}

	@Override
	public void emitirSonido() {
		System.out.println("¡Guau Guau Guau!");
	}
}