package Herencias_personajes;

public class Backyardigans extends Personajes {

    private String color;
    private String tamaño;
    private String especie;

    public Backyardigans(String nombre, String especie, String habilidades, String personalidad, String genero) {
        super(nombre, especie, habilidades, personalidad, genero);
        this.color = color;
        this.especie = especie;
    }
    public void cantar() {
        System.out.println(nombre + " está cantando");
    }
    public void bailar(String tipobaileString) {
        System.out.println(nombre + " está bailando" + tipobaileString);
    }
    public void imaginar () {
        System.out.println(nombre + "esta imaginando");
    }
}
