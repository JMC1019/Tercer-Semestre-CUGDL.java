package Herencias_personajes;

public class Main{
    public static void main(String[] args) {
        Personajes personaje1 = new Personajes("Pablo", "Pinguino", "Cantar y bailar", "Alegre", "Macho");
        personaje1.presentarse();
        personaje1.informacion();

        Backyardigans Tasha = new Backyardigans("Tasha", "Hipopótamo", "Cantar y bailar", "Amable", "Hembra");
        Tasha.bailar("salsa");
        Tasha.cantar();
        Tasha.imaginar();
        Tasha.presentarse();
        Tasha.informacion();
    }
}