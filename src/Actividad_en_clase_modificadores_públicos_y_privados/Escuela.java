package Actividad_en_clase_modificadores_públicos_y_privados;

public class Escuela {

    // 1. ATRIBUTOS (Variables de instancia)
    private String carrera;
    public String salon;
    private String alumno;
    public String pais;

    // 2. CONSTRUCTOR (Corregido)
    // Solo pedimos los datos reales: carrera, alumno, salon y pais.
    public Escuela(String carrera, String alumno, String salon, String pais) {
        this.carrera = carrera;
        this.alumno = alumno;
        this.salon = salon;
        this.pais = pais;
    }

    // 3. MÉTODOS (Acciones)

    public void ensenar(String nombredeMateria) {
        System.out.println("--------------------------------");
        System.out.println(this.alumno + " está aprendiendo " + nombredeMateria);
        System.out.println("--------------------------------");
    }

    public void titularse() {
        System.out.println("--------------------------------");
        System.out.println(this.alumno + " se ha titulado de la carrera de " + this.carrera);
        System.out.println("¡Felicidades " + this.alumno + "!");
        System.out.println("--------------------------------");
    }

    public void intercambio(String paisDestino) {
        System.out.println("--------------------------------");
        System.out.println(this.alumno + " realizará un intercambio en " + paisDestino);
        System.out.println("--------------------------------");
    }

    public void darDebaja() {
        System.out.println("--------------------------------");
        System.out.println("El alumno " + this.alumno + " se dio de baja de la carrera de " + this.carrera);
        System.out.println("--------------------------------");
    }

    public void pagar() {
        System.out.println("--------------------------------");
        System.out.println(this.alumno + " ha pagado el semestre de la UDG");
        System.out.println("--------------------------------");
    }
}