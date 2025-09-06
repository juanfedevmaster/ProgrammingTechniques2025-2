public class ExposicionHistorica extends Exposicion {
    public ExposicionHistorica() {

    }

    public ExposicionHistorica(String nombre, int duracionMinutos, int numeroVisitas, boolean enMantenimiento) {
        super(nombre, duracionMinutos, numeroVisitas, enMantenimiento);
    }

    @Override
    public void interaccionVisitante(){
        System.out.println("Interactuan por medio de una obra histórica.");
    }
}
