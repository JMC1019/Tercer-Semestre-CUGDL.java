import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese el nombre:");
    String nombre = sc.nextLine();
    System.out.println("Escribe un numero");
    int n1 = sc.nextInt();
    System.out.println("Escribe otro numero");
    int n2 = sc.nextInt();

    System.out.println("Hola " + nombre + ", la suma de " + n1 + " y " + n2 + " es " + (n1 + n2));

    sc.close();
    }
}