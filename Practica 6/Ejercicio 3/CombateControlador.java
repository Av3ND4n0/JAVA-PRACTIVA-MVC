public class CombateControlador {
    private CombateModelo modelo;
    private CombateVista vista;
    public CombateControlador(
            CombateModelo modelo,
            CombateVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    public void atacarEnemigo() {
        int posicion = vista.pedirEnemigo();
        modelo.atacarEnemigo(posicion);
        vista.mostrarMensaje("El jugador atacó al enemigo.");
        enemigoAtaca();
    }
    public void enemigoAtaca() {
        if (modelo.getEnemigos().size() > 0) {
            int posicion =
                    (int) (Math.random()
                    * modelo.getEnemigos().size());
            modelo.atacarJugador(posicion);
            vista.mostrarMensaje("Un enemigo atacó al jugador.");
        }
    }
    public void iniciar() {
        String opcion;
        do {
            vista.mostrarMenu();
            opcion = vista.pedirOpcion();
            switch (opcion) {
                case "1":
                    atacarEnemigo();
                    break;
                case "2":
                    vista.mostrarEstado(modelo.getJugador(), modelo.getEnemigos());
                    break;
                case "3":
                    vista.mostrarMensaje("Saliendo...");
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida.");
            }
        } while (!opcion.equals("3"));
    }
}