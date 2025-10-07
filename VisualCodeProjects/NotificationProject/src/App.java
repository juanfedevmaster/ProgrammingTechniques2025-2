public class App {
    public static void main(String[] args) throws Exception {
        // Crear una instancia del sistema de notificaciones
        SistemaDeNotificaciones sistemaNotificaciones = new SistemaDeNotificaciones();

        // Crear una notificación
        INotificacion notificacion1 = new NotificacionSMS("001", "Bienvenido a nuestro sistema!");
        INotificacion notificacion2 = new NotificacionEmail("002", "Ested se a loguedo en el sistema!");
        INotificacion notificacion3 = new NotificacionPush("003", "Oferta relampago, compra una switch 2 con el 25% de descuento");
        

        // Crear algunos clientes
        Cliente cliente1 = new Cliente("12345678", "Juan", "Pérez", "3001112233", "juan.perez@udea.edu.co", true);
        Cliente cliente2 = new Cliente("87654321", "María", "González", "3001112234", "maria.gonzalez@udea.edu.co",
                true);
        Cliente cliente3 = new Cliente("11223344", "Carlos", "Rodríguez", "3001112235", "carlos.rodríguez@udea.edu.co",
                false);

        sistemaNotificaciones.getClientes().add(cliente1);
        sistemaNotificaciones.getClientes().add(cliente2);
        sistemaNotificaciones.getClientes().add(cliente3);

        sistemaNotificaciones.setNotificacion(notificacion1);
        sistemaNotificaciones.enviarNotificacion();

        sistemaNotificaciones.setNotificacion(notificacion2);
        sistemaNotificaciones.enviarNotificacion();

        sistemaNotificaciones.setNotificacion(notificacion3);
        sistemaNotificaciones.enviarNotificacion();
    }
}
