package Security_Vault_con_POO;

public class Main {
    public static void main(String[] args) {
        BovedaDigital miBoveda = new BovedaDigital("1234", "DataLake");

        System.out.println("--- INTENTOS FALLIDOS ---");
        System.out.println("Intento 1: " + miBoveda.accederContenido("9999"));
        System.out.println("Intento 2: " + miBoveda.accederContenido("8888"));
        System.out.println("Intento 3: " + miBoveda.accederContenido("7777"));

        System.out.println("\n--- PRUEBA CON PIN CORRECTO ---");
        System.out.println("Intento con PIN '1234': " + miBoveda.accederContenido("1234"));
    }
}