package Entities;

public class Persona {
    // Atributos privados (encapsulados)
    private String nombre;
    private String apellido;
    private int edad;
    private String email;
    private String telefono;
    private String direccion;
    private double altura;
    private boolean activo;

    // Constructors
    public Persona() {
        this.activo = true; // Por defecto, una persona está activa
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.activo = true;
    }

    public Persona(String nombre, String apellido, int edad, String email, String telefono, String direccion,
            int altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.activo = true;
        this.altura = altura;
    }

    // Getters y Setters para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre.trim();
        }
    }

    // Getters y Setters para apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido != null && !apellido.trim().isEmpty()) {
            this.apellido = apellido.trim();
        }
    }

    // Getters y Setters para edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 150) {
            this.edad = edad;
        }
    }

    // Getters y Setters para email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email.toLowerCase().trim();
        }
    }

    // Getters y Setters para telefono
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono != null && !telefono.trim().isEmpty()) {
            this.telefono = telefono.trim();
        }
    }

    // Getters y Setters para direccion
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion != null && !direccion.trim().isEmpty()) {
            this.direccion = direccion.trim();
        }
    }

    // Getters y Setters para altura
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0 && altura <= 3.0) {
            this.altura = altura;
        }
    }

    // Getters y Setters para activo
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Métodos adicionales útiles
    public String getNombreCompleto() {
        if (nombre != null && apellido != null) {
            return nombre + " " + apellido;
        }
        return nombre != null ? nombre : (apellido != null ? apellido : "");
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public String formatToSave() {
        var format = this.nombre + "|" + this.apellido + "|" + this.direccion + "|" + this.altura;
        return format;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\n' +
                ", apellido='" + apellido + '\n' +
                ", edad=" + edad +
                ", email='" + email + '\n' +
                ", telefono='" + telefono + '\n' +
                ", direccion='" + direccion + '\n' +
                ", altura=" + altura +
                ", activo=" + activo +
                '}';
    }
}
