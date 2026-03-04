package pooEjercercicios.abstraccion;

public class PlanFamiliar extends Suscripcion{
	//El regargo del 40%
	private static final double PLUS=0.4;
	
	private int maxPerfiles=5;
	

	public PlanFamiliar(String nombreUsuario, double precioBase) {
		super(nombreUsuario, precioBase);
	}
	
	@Override
	protected double calcularPrecio() {
		return getPrecioBase() * (1+PLUS);
	}

	@Override
	//Posible refactorizacion, subir método al padre, el atributo también e inicializar en el constructor
	protected int getMaxPerfiles() {
		return maxPerfiles;
	}



}
