public class App {
    public static void main(String[] args) throws Exception {
        Exposicion exposicionTecnologica = new ExposicionTecnologica("inteligencia Artificial Aplicada",
                60, 50, false);

        Exposicion exposicionHistorica = new ExposicionHistorica("La revolución Francesa",
                60, 25, false);

        Exposicion exposicionCientifica = new ExposicionCientifica("Maremotos",
                25, 50, false);

        exposicionTecnologica.interaccionVisitante();
        exposicionHistorica.interaccionVisitante();
        exposicionCientifica.interaccionVisitante();
    }
}
