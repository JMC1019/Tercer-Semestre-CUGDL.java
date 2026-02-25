class Persona {
    protected String nombre;
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
}

class Paciente extends Persona {
    protected int edad;
    protected double peso;
    public Paciente(String nombre, int edad, double peso) {
        super(nombre);
        this.edad = edad;
        this.peso = peso;
    }

    public double calcularDosis(double dosisBase) {
        double dosisFinal = (this.peso * 0.8) + dosisBase;
        return dosisFinal;
    }
}

public class SistemaHospital {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("Juan", 25, 70.5);
        System.out.println("Paciente detectado: " + p1.nombre);
        double dosis = p1.calcularDosis(10);
        if (dosis > 100) {
            System.out.println("Alerta: Dosis excesiva");
        }
    }
}