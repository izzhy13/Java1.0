package juegos;

import java.util.Arrays;

public class TresEnRaya {
	
	static char[][] tablero = new char[3][3];
	
	public static void mostrarTablero () {
		System.out.println("\n Tablero actual \n-----------------");
		for (int i=0; i < tablero.length; i++) {
			for(int j=0; j< tablero[i].length;j++) {
				System.out.print(tablero[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	
	public static int colocarFicha (int fila, int columna, char ficha) {
		if (tablero[fila][columna] == '-') {
			tablero[fila][columna]=ficha;
			return 0;
		}else {
			//Si no hay guión es que hay una ficha
			System.out.println("Ya hay una ficha colocada");
			return -1;
		}
	}
	
	public static boolean finPartida() {
		//hay 3 en raya en la horizontal
		for (int i=0; i < tablero.length;i++) {
			if ((tablero[i][0]==tablero[i][1] && tablero[i][1]==tablero[i][2])  && tablero[i][0]!='-') {
				return true;
			}
		}
		
		//Comprobamos las columnas
		for (int j=0; j< tablero[0].length;j++) {
			if ((tablero[0][j]==tablero[1][j] && tablero[1][j]==tablero[2][j]) && tablero[0][j]!='-') {
				return true;
			}
		}
		
		//Ahora con las diagonales
		if ((tablero[0][0]==tablero[1][1] && tablero[1][1]==tablero[2][2] && tablero[0][0]!='-')
				||
		    (tablero[0][2]==tablero[1][1] && tablero[1][1]==tablero[2][0])  && tablero[0][2]!='-') {
			return true;
		}
		
		//Si llegamos aquí es que nadie ganó aun
		return false;
	}
	
	public static boolean hayEmpate() {
		for (int i=0; i < tablero.length; i++){
			for (int j=0; j < tablero.length; j++) {
				if (tablero[i][j]=='-') {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
			
		for (int i=0; i< tablero.length;i++) {
			Arrays.fill(tablero[i], '-');
		
		}
		mostrarTablero();
		colocarFicha(1,2,'X');
		mostrarTablero();
		System.out.println(finPartida());
	}

}
