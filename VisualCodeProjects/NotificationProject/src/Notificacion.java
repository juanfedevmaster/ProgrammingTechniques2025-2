/**
 * Clase que representa una notificación
 */
public class Notificacion {
    private String id;
    private String mensaje;
    
    /**
     * Constructor por defecto
     */
    public Notificacion() {
    }
    
    /**
     * Constructor con parámetros
     */
    public Notificacion(String id, String mensaje) {
        this.id = id;
        this.mensaje = mensaje;
    }
    
    // Getters y Setters
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getMensaje() {
        return mensaje;
    }
    
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    @Override
    public String toString() {
        return "Notificacion{" +
                "id='" + id + '\'' +
                ", mensaje='" + mensaje + '\'' +
                '}';
    }
}