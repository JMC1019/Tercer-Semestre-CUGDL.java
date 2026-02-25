package Herencia_y_polimorfismo;

class Carro {
    protected String marca;
    protected String modelo;
    protected String color;
    protected Double precio;
    protected Double velocidad;
    protected String estado;

    public Carro(String marca, String modelo,String color, double precio, double velocidad, String estado ){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.precio=precio;
        this.velocidad=velocidad;
        this.estado=estado;
    }

    public void mostrarInformacion(){
        System.out.println("Información del vehículo:");
        System.out.println("--------------------------");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Velocidad"+velocidad);
        System.out.println("Estado del vehículo: "+estado);

    }

    public void avanzar(){
        if(estado=="Detenido"){
            estado="Avanzando";
            System.out.println(modelo+ " avanza a "+velocidad+" km/h");
        }
    }

    public void detenerse(){
        if(estado=="Avanzado"){
            estado="Detenido";
            System.out.println("El vehículo se encuentra detenido");
        }
    }
}
