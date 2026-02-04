package pooEjercercicios;

public class AppGestionMatriculas {

	public static void main(String[] args) {
		Estudiante estu1= new Estudiante("Eduardo");
		System.out.println("Me llamo " + estu1.getNombre() + " y mi matrícula es " + estu1.getNumMatricula());

		Estudiante estu2= new Estudiante("Paco");
		System.out.println("Me llamo " + estu2.getNombre() + " y mi matrícula es " + estu2.getNumMatricula());
		
		//Puedo hacerlo pero no es recomendable
		System.out.println (estu1.getSiguienteMatricula() + " " + estu2.getSiguienteMatricula());
		
		//Se accede a través de la clase
		System.out.println (Estudiante.getSiguienteMatricula());
	}

}
