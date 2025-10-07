import java.util.List;

public class NotificacionPush extends Notificacion implements INotificacion {
    
    /**
     * Constructor por defecto
     */
    public NotificacionPush() {
    }

    /**
     * Constructor con parámetros
     */
    public NotificacionPush(String id, String mensaje) {
        super(id, mensaje);
    }

    @Override
    public boolean enviar(List<Cliente> clientes) {
        System.out.println("Enviando notificación:" + this.getMensaje() + "\nPor medio de Push a los clientes");
        for (Cliente cliente : clientes) {
            if (cliente.isTieneApp()) {
                System.out.println("Nombre Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
            }
        }
        return true;
    }
}
