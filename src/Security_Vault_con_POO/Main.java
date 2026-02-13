package Security_Vault_con_POO;

public class Main {
    public static void main(String[] args) {
        BovedaDigital miBoveda = new BovedaDigital("1234", "Planos de la Estrella de la Muerte");

        System.out.println("--- INICIO DE PRUEBA DE SEGURIDAD ---");

        System.out.println("Intento 1 (PIN 0000): " + miBoveda.accederContenido("0000"));
        System.out.println("Intento 2 (PIN 9999): " + miBoveda.accederContenido("9999"));
        System.out.println("Intento 3 (PIN 5555): " + miBoveda.accederContenido("5555"));

        System.out.println("\n--- LA BÓVEDA DEBERÍA ESTAR BLOQUEADA ---");

        System.out.println("Intento 4 (PIN CORRECTO 1234): " + miBoveda.accederContenido("1234"));
    }
}