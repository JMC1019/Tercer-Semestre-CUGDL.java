package Security_Vault_con_POO;
import java.util.ArrayList;

public class BovedaDigital {
    private String llaveMaestra;
    private String contenidoSensible;
    private int intentosFallidos;
    private boolean estaBloqueada;
    private ArrayList<String> registroActividad;

    public BovedaDigital(String llaveMaestra, String contenidosensible){
        this.llaveMaestra = llaveMaestra;
        this.contenidoSensible = contenidosensible;
        this.intentosFallidos = 0;
        this.estaBloqueada = false;
        this.registroActividad = new ArrayList<String>();
    }

    private void registrarEvento(String mensaje) {
        this.registroActividad.add(mensaje);
    }

    public String accederContenido(String pinIngresado) {
        if (this.estaBloqueada) {
            registrarEvento("Intento de acceso rechazado: Bóveda Bloqueada.");
            return "ACCESO DENEGADO: La bóveda está bloqueada. Contacte al administrador.";
        }
        if (this.llaveMaestra.equals(pinIngresado)) {
            // Éxito: Reseteamos contadores y registramos
            this.intentosFallidos = 0;
            registrarEvento("Acceso exitoso al contenido sensible.");
            return this.contenidoSensible;
        } else {
            this.intentosFallidos++;
            registrarEvento("Intento fallido de acceso. Intento número: " + this.intentosFallidos);
            if (this.intentosFallidos >= 3) {
                this.estaBloqueada = true;
                registrarEvento("ALERTA DE SEGURIDAD: Bóveda bloqueada automáticamente.");
            }
            return "PIN Incorrecto.";
        }
    }

    public boolean cambiarLlaveMaestra(String pinActual, String nuevoPin) {
        if (this.estaBloqueada) {
            registrarEvento("Intento de cambio de PIN rechazado: Bóveda Bloqueada.");
            return false;
        }
        if (!this.llaveMaestra.equals(pinActual)) {
            registrarEvento("Fallo al cambiar PIN: Credencial actual incorrecta.");
            return false;
        }
        if (nuevoPin.length() < 8) {
            registrarEvento("Fallo al cambiar PIN: El nuevo PIN no cumple longitud mínima.");
            System.out.println("Error: El nuevo PIN debe tener al menos 8 caracteres.");
            return false;
        }
        this.llaveMaestra = nuevoPin;
        registrarEvento("AUDITORÍA: La llave maestra ha sido cambiada exitosamente.");
        return true;
    }

    public void auditarBoveda() {
        System.out.println("--- LOG DE AUDITORÍA ---");
        for (String evento : this.registroActividad) {
            System.out.println(evento);
        }
        System.out.println("------------------------");
    }

    public boolean desbloquearBoveda(String codigoAdmin) {
        final String CODIGO_MAESTRO_ADMIN = "ADMIN_SECURE_2024";
        if (codigoAdmin.equals(CODIGO_MAESTRO_ADMIN)) {
            this.estaBloqueada = false;
            this.intentosFallidos = 0;
            registrarEvento("ADMIN: Desbloqueo manual de emergencia realizado.");
            return true;
        } else {
            registrarEvento("ALERTA CRÍTICA: Intento no autorizado de desbloqueo administrativo.");
            return false;
        }
    }
}
