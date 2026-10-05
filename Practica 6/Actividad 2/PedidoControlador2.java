import java.util.List;
public class PedidoControlador2 {
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
    public void eliminarPedido() {
        int posicion = vista.solicitarPosicion();
        modelo.eliminarPedido(posicion);
        vista.mostrarMensaje("Pedido eliminado.");
    }
    public void actualizarPedido() {
        int posicion = vista.solicitarPosicion();
        String nuevoNombre = vista.solicitarNombre();
        modelo.actualizarPedido(posicion, nuevoNombre);
        vista.mostrarMensaje("Pedido actualizado.");
    }
    public void buscarPedido() {
        String texto = vista.solicitarTexto();
        List<Pedido> resultados = modelo.buscarPedido(texto);
        vista.mostrarPedidos(resultados);
    }
    public void contarPedidos() {
        int total = modelo.contarPedidos();
        vista.mostrarMensaje("Total de pedidos: " + total);
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
                    eliminarPedido();
                    break;
                case "4":
                    actualizarPedido();
                    break;
                case "5":
                    buscarPedido();
                    break;
                case "6":
                    contarPedidos();
                    break;
                case "7":
                    vista.mostrarMensaje("Saliendo...");
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida.");
            }
        } while (!opcion.equals("7"));
    }
}