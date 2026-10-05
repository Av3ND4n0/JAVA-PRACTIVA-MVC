import java.util.ArrayList;
import java.util.List;
public class PedidoModelo3 {
    private List<Pedido> pedidos;
    public PedidoModelo() {
        pedidos = new ArrayList<>();
    }
    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
    public List<Pedido> getPedidos() {
        return pedidos;
    }
    public void completarPedido(int posicion) {
        if (posicion >= 0 && posicion < pedidos.size()) {
            pedidos.get(posicion).setEstado("Completo");
        }
    }
    public void eliminarPedido(int posicion) {
        if (posicion >= 0 && posicion < pedidos.size()) {
            pedidos.get(posicion).setEstado("Eliminado");
        }
    }
    public int contarPendientes() {
        int contador = 0;
        for (Pedido pedido : pedidos) {
            if (pedido.getEstado().equals("Pendiente")) {
                contador++;
            }
        }
        return contador;
    }
    public List<Pedido> obtenerPorEstado(String estado) {
        List<Pedido> resultados = new ArrayList<>();
        for (Pedido pedido : pedidos) {
            if (pedido.getEstado().equalsIgnoreCase(estado)) {
                resultados.add(pedido);
            }
        }
        return resultados;
    }
    public List<Pedido> obtenerHistorial() {
        List<Pedido> historial = new ArrayList<>();
        for (Pedido pedido : pedidos) {
            if (pedido.getEstado().equals("Completo")
                    || pedido.getEstado().equals("Eliminado")) {
                historial.add(pedido);
            }
        }
        return historial;
    }
}