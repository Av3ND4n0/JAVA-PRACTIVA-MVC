public class InventarioControlador {
    private InventarioModelo modelo;
    private InventarioVista vista;
    public InventarioControlador(
            InventarioModelo modelo,
            InventarioVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    public void agregarItem() {
        String nombre = vista.pedirNombre();
        int cantidad = vista.pedirCantidad();
        String tipo = vista.pedirTipo();
        String descripcion = vista.pedirDescripcion();
        Item item = new Item(
                nombre,
                cantidad,
                tipo,
                descripcion
        );
        modelo.agregarItem(item);
        vista.mostrarMensaje("Item agregado.");
    }
    public void buscarItem() {
        String nombre = vista.pedirNombre();
        Item item = modelo.buscarItem(nombre);
        vista.mostrarDetalle(item);
    }
    public void eliminarItem() {
        int posicion = vista.pedirPosicion();
        modelo.eliminarItem(posicion);
        vista.mostrarMensaje("Item eliminado.");
    }
    public void usarItem() {
        String nombre = vista.pedirNombre();
        Item item = modelo.buscarItem(nombre);
        if (item != null) {
            item.usarItem();
        } else {
            vista.mostrarMensaje("Item no encontrado.");
        }
    }
    public void iniciar() {
        String opcion;
        do {
            vista.mostrarMenu();
            opcion = vista.pedirOpcion();
            switch (opcion) {
                case "1":
                    agregarItem();
                    break;
                case "2":
                    vista.mostrarInventario(modelo.obtenerItems());
                    break;
                case "3":
                    buscarItem();
                    break;
                case "4":
                    eliminarItem();
                    break;
                case "5":
                    usarItem();
                    break;
                case "6":
                    vista.mostrarMensaje("Saliendo...");
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida.");
            }
        } while (!opcion.equals("6"));
    }
}
