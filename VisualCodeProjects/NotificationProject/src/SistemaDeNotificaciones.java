import java.util.List;
import java.util.ArrayList;

/**
 * Clase principal del sistema de notificaciones
 */
public class SistemaDeNotificaciones {
    private INotificacion notificacion;
    private List<Cliente> clientes;

    /**
     * Constructor por defecto
     */
    public SistemaDeNotificaciones() {
        this.clientes = new ArrayList<>();
    }

    /**
     * Constructor con parámetros
     */
    public SistemaDeNotificaciones(INotificacion notificacion, List<Cliente> clientes) {
        this.notificacion = notificacion;
        this.clientes = clientes;
    }

    /**
     * Método para enviar notificación
     * 
     * @return true si se pudo enviar la notificación, false en caso contrario
     */
    public boolean enviarNotificacion() {
        this.notificacion.enviar(clientes);
        return true;
    }

   

    public INotificacion getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(INotificacion notificacion) {
        this.notificacion = notificacion;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes != null ? clientes : new ArrayList<>();
    }
}