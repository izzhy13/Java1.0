package laboratorios;

public class AppJugador { 
	 
    public static void main(String[] args) { 

        // Antes de crear ningún jugador podemos consultar datos globales 
        System.out.println("Jugadores al inicio: " + Jugador.getTotalJugadores());  

        // Creamos jugadores 
        Jugador j1 = new Jugador("Ana",    1500); 
        Jugador j2 = new Jugador("Bruno",  3200); 
        Jugador j3 = new Jugador("Carmen",  980); 

        // Métodos de instancia: necesitamos el objeto 
        j1.mostrarFicha();  
        j2.mostrarFicha();  
        j3.mostrarFicha(); 

        System.out.println(); 

        // Métodos estáticos: los llamamos con el nombre de la clase 
        Jugador.resumenGlobal(); 

        // Acceso correcto a métodos estáticos 
        System.out.println(Jugador.getTotalJugadores());  
 
        // Funciona pero da warning: llama a un método estático desde un objeto 
        System.out.println(j1.getTotalJugadores());        
    } 
} 
