/**
 * Clase que representa un cliente del sistema de notificaciones
 */
public class Cliente {
    private String cedula;
    private String nombre;
    private String apellido;
    private String numeroCelular;
    private String email;
    private boolean tieneApp;
    
    /**
     * Constructor por defecto
     */
    public Cliente() {
    }
    
    /**
     * Constructor con parámetros
     */
    public Cliente(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    /**
     * Constructor completo con todos los parámetros
     */
    public Cliente(String cedula, String nombre, String apellido, String numeroCelular, String email, boolean tieneApp) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCelular = numeroCelular;
        this.email = email;
        this.tieneApp = tieneApp;
    }
    
    // Getters y Setters
    public String getCedula() {
        return cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getNumeroCelular() {
        return numeroCelular;
    }
    
    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean isTieneApp() {
        return tieneApp;
    }
    
    public void setTieneApp(boolean tieneApp) {
        this.tieneApp = tieneApp;
    }
    
    @Override
    public String toString() {
        return "Cliente{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroCelular='" + numeroCelular + '\'' +
                ", email='" + email + '\'' +
                ", tieneApp=" + tieneApp +
                '}';
    }
}