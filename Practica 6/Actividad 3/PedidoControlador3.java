public class PedidoControlador3 {
    private PedidoModelo modelo;
    private PedidoVista vista;
    public PedidoControlador(PedidoModelo modelo, PedidoVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    public void agregarPedido() {
        String nombre = vista.solicitarNombre();
        String tipo = vista.solicitarTipo();
        Pedido pedido = new Pedido(nombre, tipo);
        modelo.agregarPedido(pedido);
        vista.mostrarMensaje("Pedido agregado.");
    }
    public void mostrarPedidos() {
        vista.mostrarPedidos(modelo.getPedidos());
    }
    public void completarPedido() {
        int posicion = vista.solicitarPosicion();
        modelo.completarPedido(posicion);
        vista.mostrarMensaje("Pedido completado.");
    }
    public void mostrarPendientes() {
        vista.mostrarPedidos(
                modelo.obtenerPorEstado("Pendiente")
        );
    }
    public void mostrarCompletos() {
        vista.mostrarPedidos(
                modelo.obtenerPorEstado("Completo")
        );
    }
    public void contarPendientes() {
        int cantidad = modelo.contarPendientes();
        vista.mostrarMensaje(
                "Pedidos pendientes: " + cantidad
        );
    }
    public void mostrarHistorial() {
        vista.mostrarPedidos(modelo.obtenerHistorial());
    }
    public void eliminarPedido() {
        int posicion = vista.solicitarPosicion();
        modelo.eliminarPedido(posicion);
        vista.mostrarMensaje("Pedido eliminado.");
    }
    public void iniciar() {
        String opcion;
        do {
            vista.mostrarMenu();
            opcion = vista.solicitarOpcion();
            switch (opcion) {
                case "1":
                    agregarPedido();
                    break;
                case "2":
                    mostrarPedidos();
                    break;
                case "3":
                    completarPedido();
                    break;
                case "4":
                    mostrarPendientes();
                    break;
                case "5":
                    mostrarCompletos();
                    break;
                case "6":
                    contarPendientes();
                    break;
                case "7":
                    mostrarHistorial();
                    break;
                case "8":
                    eliminarPedido();
                    break;
                case "9":
                    vista.mostrarMensaje("Saliendo...");
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida.");
            }
        } while (!opcion.equals("9"));
    }
}
