package Herencia_y_polimorfismo;

public class Main {
    public static void main(String[] args) {
        Carro miCarro = new Carro("Toyota", "Corolla", "Rojo", 20000.0, 120.0, "Detenido");
        miCarro.mostrarInformacion();
        miCarro.avanzar();
        miCarro.detenerse();
    }
}
