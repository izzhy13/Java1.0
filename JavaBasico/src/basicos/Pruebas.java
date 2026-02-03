package basicos;

import java.util.ArrayList;

public class Pruebas {
	public static void main (String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		lista.add("Hola");
		lista.add("Qué");
		lista.add("Tal");
		
		System.out.println("Ahora en la posición 1 está: " + lista.get(1) + " y mi lista tiene tamaño " + lista.size());
		
		lista.remove(1);
		
		System.out.println("Ahora en la posición 1 está: " + lista.get(1) + " y mi lista tiene tamaño " + lista.size());
	}
	
	
}
