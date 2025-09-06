public class ExposicionCientifica extends Exposicion {
    public ExposicionCientifica() {

    }

    public ExposicionCientifica(String nombre, int duracionMinutos, int numeroVisitas, boolean enMantenimiento) {
        super(nombre, duracionMinutos, numeroVisitas, enMantenimiento);
    }

    @Override
    public void interaccionVisitante(){
        System.out.println("Interactuan por medio de un experimento.");
    }
}
