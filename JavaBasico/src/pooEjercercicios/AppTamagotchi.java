package pooEjercercicios;

public class AppTamagotchi {

	public static void main(String[] args) {
		Tamagotchi tama1 = new Tamagotchi("Pako");
		Tamagotchi tama2 = new Tamagotchi("Secun", 25, 80);
		Tamagotchi tama3 = new Tamagotchi("Cansino", 10, 55);

		//Hacer menú
		tama1.status();
		tama2.status();
		tama3.status();
		
		tama2.dormir();
		tama2.comer();
		tama2.comer();
		tama2.status();
		
		tama1.jugar();
		tama1.status();
		tama3.jugar();

		
	}

}
