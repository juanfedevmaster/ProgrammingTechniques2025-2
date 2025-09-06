public class ExposicionTecnologica extends Exposicion {
    public ExposicionTecnologica() {

    }

    public ExposicionTecnologica(String nombre, int duracionMinutos, int numeroVisitas, boolean enMantenimiento) {
        super(nombre, duracionMinutos, numeroVisitas, enMantenimiento);
    }

    @Override
    public void interaccionVisitante(){
        System.out.println("Interactuan por medio de computadores.");
    }
}