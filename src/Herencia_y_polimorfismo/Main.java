package Herencia_y_polimorfismo;

public class Main {
    public static void main(String[] args) {
        Carro Carro1 = new Carro("BMW", "M5 Competition", "Verde", 3500000.0, 280.0, "");
        Carro1.mostrarInformacion();
        Carro1.avanzar();
        Carro1.detenerse();

        Carro Carro2 = new Carro("Mercedes-Benz", "AMG GT", "Rojo", 4000000.0, 310.0, "");
        Carro2.mostrarInformacion();
        Carro2.avanzar();
        Carro2.detenerse();
    }
}
