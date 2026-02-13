package pooEjercercicios.herencia;

public class AppRefugio {

	public static void main(String[] args) {
		
		Gato miGato = new Gato("Misifu");
		Perro miPerro = new Perro("Toby");
		
		miGato.hacerSonido();
		miPerro.hacerSonido();
	}

}
