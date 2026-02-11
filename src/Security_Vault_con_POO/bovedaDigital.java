package Security_Vault_con_POO;
import java.util.ArrayList;

public class bovedaDigital {
    private String llaveMaestra;
    private String contenidosensible;
    private int intentosFallidos;
    private boolean estaBloqueado;
    private ArrayList<String> registroActividad;

    public bovedaDigital(String llaveMaestra, String contenidosensible){
        this.llaveMaestra = llaveMaestra;
        this.contenidosensible = contenidosensible;
        this.intentosFallidos = 0;
        this.estaBloqueado = false;
        this.registroActividad = new ArrayList<String>();
    }

}
