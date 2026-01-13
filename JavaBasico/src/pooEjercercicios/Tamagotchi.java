package pooEjercercicios;

public class Tamagotchi {
	private String nombre;
	private int hambre;
	private int energia;
	
	public Tamagotchi(String nombre) {
		this.nombre=nombre;
		this.energia=100;
		this.hambre=0;
	}
	
	public Tamagotchi(String nombre, int energia, int hambre) {
		this.nombre=nombre;
		this.energia=energia;
		this.hambre=hambre;
	}
	
	public void status() {
		System.out.println("Tu mascota " + nombre + " tiene " + hambre + 
				" de hambre y " +energia + " de energía");
	}
	
	public void comer() {
		if (this.hambre <= 10) {
			this.hambre=0;
		} else {
			this.hambre-=10; //Lo mismo que this.hambre=this.hambre-10;	
		}
		
	}
	
	public void jugar() {
		if (this.energia>=20) {
			if (this.hambre<85) {
				this.hambre+=15;
			} else {
				this.hambre=100;
			}
			this.energia-=20;
		} else {
			System.out.print("Estoy muy cansado para jugar, necesito una siesta");
		}
		
	}
	
	public void dormir() {
		this.energia=100;
	}
	
}
