package ejercicios;

import java.util.Scanner;

public class SiONo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String opcion;
		int opcion2;
		do{
			System.out.print("¿Quieres continuar? (s/n)");
			opcion=scan.nextLine();
			
		} while (!opcion.equals("s"));

		scan.close();
	}
}


