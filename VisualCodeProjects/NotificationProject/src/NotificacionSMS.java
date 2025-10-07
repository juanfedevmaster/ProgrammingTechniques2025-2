import java.util.List;

public class NotificacionSMS extends Notificacion implements INotificacion {

    /**
     * Constructor por defecto
     */
    public NotificacionSMS() {
    }

    /**
     * Constructor con parámetros
     */
    public NotificacionSMS(String id, String mensaje) {
        super(id, mensaje);
    }

    @Override
    public boolean enviar(List<Cliente> clientes) {
        System.out.println("Enviando notificación:" + this.getMensaje() + "\nPor medio de SMS a los clientes");
        for (Cliente cliente : clientes) {
            if ((!cliente.getNumeroCelular().isBlank() &&
                    !cliente.getNumeroCelular().isEmpty()) &&
                    cliente.getNumeroCelular().length() == 10) {
                System.out.println("Nombre Cliente: " + cliente.getNombre() + " " + cliente.getApellido()
                        + ", con # Celular: " + cliente.getNumeroCelular());
            }
        }
        return true;
    }

}
