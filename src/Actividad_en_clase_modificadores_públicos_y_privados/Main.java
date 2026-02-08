package Actividad_en_clase_modificadores_públicos_y_privados;

public class Main {
    public static void main(String[] args) {

        // 1. Crear el objeto (Instanciar)
        // Solo enviamos: Carrera, Alumno, Salón, País
        Escuela miEscuela = new Escuela("Ciberseguridad", "Oswaldo Sanchez", "N201", "Barcelona, España");

        // 2. Ejecutar las acciones
        System.out.println("--------------------------------");
        miEscuela.ensenar("Ciberseguridad");
        miEscuela.intercambio("Barcelona, España");
        miEscuela.pagar();
        miEscuela.titularse();
        miEscuela.darDebaja();
        System.out.println("--------------------------------");
    }
}