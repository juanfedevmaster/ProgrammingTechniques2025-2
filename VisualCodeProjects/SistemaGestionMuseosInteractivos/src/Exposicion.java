public abstract class Exposicion {
    private String nombre;
    private int duracionMinutos;
    private int numeroVisitas;
    private boolean enMantenimiento;

    public Exposicion(){

    }

    public Exposicion(String nombre, int duracionMinutos,int numeroVisitas,boolean enMantenimiento){
        this.nombre = nombre;
        this.duracionMinutos = duracionMinutos;
        this.numeroVisitas = numeroVisitas;
        this.enMantenimiento = enMantenimiento;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(int value){
        this.duracionMinutos = value;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public int getNumeroVisitas() {
        return numeroVisitas;
    }

    public void setNumeroVisitas(int numeroVisitas) {
        this.numeroVisitas = numeroVisitas;
    }

    public boolean isEnMantenimiento() {
        return enMantenimiento;
    }

    public void setEnMantenimiento(boolean enMantenimiento) {
        this.enMantenimiento = enMantenimiento;
    }

    abstract void interaccionVisitante();
}
