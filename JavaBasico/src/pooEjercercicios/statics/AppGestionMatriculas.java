package pooEjercercicios.statics;

import java.util.ArrayList;
import java.util.Scanner;

public class AppGestionMatriculas {
	
	public static void mostrarEstudiantes(ArrayList<Estudiante> estus) {
		for (Estudiante e : estus ) {
			System.out.println (e.getNumMatricula()+"-"+e.getNombre());
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Materia> materias = new ArrayList<>();
		ArrayList<Estudiante> estudiantes = new ArrayList<>();
		
		int opcion;

		do {

			System.out.println("\n\n¿Qué te gustaría hacer?");
			System.out.println("1-Añadir una materia");
			System.out.println("2-Añadir un estudiante");
			System.out.println("3-Matricular a un estudiante");
			System.out.println("4-Listar las materias");
			System.out.println("5-Listar los estudiantes");
			System.out.println("6-Ver número total de matriculados");
			System.out.println("0-Salir");

			System.out.println("¿qué eliges?");
			opcion=sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:
				
				break;
			case 5:
				mostrarEstudiantes(estudiantes);
				break;
			case 0:
				System.out.println("Hasta luego!");
			default:
				System.out.println("Elige una opción valida");

			}
		}while(opcion!=0);

	}
}
