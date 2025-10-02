package taller;

public class Main {

	public static void main(String[] args) {
		Animal a1 = new Animal("Tipo de Animal", 4);
		Perro p1 = new Perro("Jack", 6, "Chihuahua");
		Gato g1 = new Gato("Silvestre", 3, "Gato esfinge");
		Ave v1 = new Ave("Piolín", 2, "Canario");
		Avion A1 = new Avion("737-200","Boeing","Roger Herrera");
		
		
		System.out.println(" \t\t\t---- " + a1.getNombre() + " ---- ");
		a1.emitirSonido();
		System.out.println("\n Este perro se llama " + p1.getNombre() + ", tiene " + p1.getEdad() + " años su raza es "
				+ p1.getRazaperro() + " y hace así:");
		p1.emitirSonido();
		System.out.println("\n Este Gato se llama " + g1.getNombre() + ", tiene " + g1.getEdad() + " años su raza es "
				+ g1.getRazagato() + " y hace así:");
		g1.emitirSonido();
		System.out.println("\n Esta ave se llama " + v1.getNombre() + ", tiene " + v1.getEdad() + " años su raza es "
				+ v1.getRazaAve() + " y hace así:");
		v1.emitirSonido();
		v1.volar();
		
		System.out.println("\n El avión modelo " + A1.getModelo() + " de " + A1.getFabricante() + " está siendo Pilotado por: " + A1.getPiloto());	
		A1.volar();
	}
}


