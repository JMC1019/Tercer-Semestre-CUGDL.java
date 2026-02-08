import java.util.Scanner;

public class RegistroTorneo {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Registro de Torneo de Videojuegos");
        System.out.println("Imgresa tu Gametarg: ");
        String gametarg = sc.nextLine();
        System.out.println("¿Cuál es tu juego favorito?");
        String juegoFavorito = sc.nextLine();
        System.out.println("¿Cuál es tu nivel de jugador?");
        int nivelJugador = sc.nextInt();
        System.out.println("Precio de Inscripción: ");
        double precioInscripcion = sc.nextDouble();

        sc.close();

        System.out.println("Registro completado: "+gametarg+". Nivel: "+nivelJugador+". Total a pagar: $"+precioInscripcion+". ¡A jugar "+juegoFavorito+"!");
    }
}
