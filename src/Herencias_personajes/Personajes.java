package Herencias_personajes;

public class Personajes {
    protected String nombre;
    protected String especie;
    protected String habilidades;
    protected String personalidad;
    protected String genero;

    public Personajes(String nombre, String especie, String habilidades, String personalidad, String genero) {
        this.nombre = nombre;
        this.especie = especie;
        this.habilidades = habilidades;
        this.personalidad = personalidad;
        this.genero = genero;
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre + ", un " + especie + ".");
    }

    public void informacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Habilidades: " + habilidades);
        System.out.println("Personalidad: " + personalidad);
        System.out.println("Género: " + genero);
    }
}
