package laboratorios.pruebas;

import laboratorios.logica.Cofre;

public class CofreEspecial extends Cofre {
	public static void main(String[] args) {
		

	}

	public void mostrarDatos() {
		Cofre miCofre = new Cofre(); 
		System.out.println(this.claveSecreta);
		System.out.println(miCofre.etiqueta);
		//System.out.println(miCofre.contenido);
		//System.out.println(miCofre.dineroReal);

	}

}
