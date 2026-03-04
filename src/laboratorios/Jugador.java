package laboratorios;

public class Jugador { 

	private static int totalJugadores = 0; 
	private static int puntuacionMaxima = 0;

	private String id; 
	private String nombre; 
	private int puntuacion; 


	public Jugador(String nombre, int puntuacion) { 
		totalJugadores++;
		this.id = String.format("J%03d", totalJugadores);
		this.nombre = nombre; 
		this.puntuacion = puntuacion; 

		if (puntuacion > puntuacionMaxima) {
			puntuacionMaxima = puntuacion; 
		} 
	} 

	public static int getTotalJugadores() { 
		return totalJugadores;
		//No puede acceder a tributos de instancia
		// return nombre;               
	} 


	public static int getPuntuacionMaxima() { 
		return puntuacionMaxima; 
	} 


	public static void resumenGlobal() { 
		System.out.println("Jugadores registrados : " + totalJugadores); 
		System.out.println("Puntuacion mas alta   : " + puntuacionMaxima); 
	} 

	public void mostrarFicha() { 
		System.out.println("[" + id + "] " + nombre + " - " + puntuacion + " pts"); 
	}

	public String getId() {
		return id;
	}


	public String getNombre() {
		return nombre;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	//Error1
	/*
    public static void metodo() { 

        System.out.println(nombre);  

    } */


	// Error2

	/*
    public static void metodo() { 
        mostrarFicha();    
    } 

    // Corrección: necesitamos un objeto 

    public static void metodo2() { 
        Jugador j = new Jugador("Test", 0); 
        j.mostrarFicha(); 

    } */

} 
