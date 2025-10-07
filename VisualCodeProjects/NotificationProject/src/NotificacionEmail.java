import java.util.List;

public class NotificacionEmail extends Notificacion implements INotificacion {
    
    /**
     * Constructor por defecto
     */
    public NotificacionEmail() {
    }

    /**
     * Constructor con parámetros
     */
    public NotificacionEmail(String id, String mensaje) {
        super(id, mensaje);
    }
    
    @Override
    public boolean enviar(List<Cliente> clientes) {
        System.out.println("Enviando notificación:" + this.getMensaje() + "\nPor medio de Email a los clientes");
        for (Cliente cliente : clientes) {
            System.out.println("Nombre Cliente: " + cliente.getNombre() + " " + cliente.getApellido()
                    + ", con Email: " + cliente.getEmail());
        }
        return true;
    }
}
