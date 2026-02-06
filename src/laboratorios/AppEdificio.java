package laboratorios;

public class AppEdificio {

	public static void main(String[] args) {
		Edificio instituto = new Edificio("IES Galileo", 0, 4);
		
		instituto.ordenarSubida(2);
		instituto.ordenarSubida(3);
		instituto.ordenarBajada(3);
		instituto.ordenarBajada(1);

	}

}
