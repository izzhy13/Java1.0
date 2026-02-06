package laboratorios;

public class AppEdificios {
    public static void main(String[] args) {
        
        Edificio torreCentral = new Edificio("Torre Central", 0, 10);
        Edificio parking = new Edificio("Parking Subterráneo", -3, 0);

        System.out.println("=== SIMULADOR DE EDIFICIOS INICIADO ===");

        System.out.println("\n--- PRUEBAS EN: Torre Central (Pisos 0 a 10) ---");
        
        torreCentral.ordenarSubida(5); 

        torreCentral.ordenarSubida(8); 

        System.out.println("\n--- PRUEBAS EN: Parking Subterráneo (Pisos -3 a 0) ---");
        
        parking.ordenarBajada(2);

        parking.ordenarSubida(1);

        parking.ordenarBajada(5);

        System.out.println("\n=== FIN DE LA SIMULACIÓN ===");
    }
}
