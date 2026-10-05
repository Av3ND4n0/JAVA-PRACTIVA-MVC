import java.util.ArrayList;
import java.util.List;
public class PedidoModelo2 {
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
    public void eliminarPedido(int posicion) {
        if (posicion >= 0 && posicion < pedidos.size()) {
            pedidos.remove(posicion);
        }
    }
    public void actualizarPedido(int posicion, String nuevoNombre) {
        if (posicion >= 0 && posicion < pedidos.size()) {
            pedidos.get(posicion).setNombrePlato(nuevoNombre);
        }
    }
    public List<Pedido> buscarPedido(String texto) {
        List<Pedido> resultados = new ArrayList<>();
        for (Pedido pedido : pedidos) {
            if (pedido.getNombrePlato().equalsIgnoreCase(texto)
                    || pedido.getTipoPlato().equalsIgnoreCase(texto)) {
                resultados.add(pedido);
            }
        }
        return resultados;
    }
    public int contarPedidos() {
        return pedidos.size();
    }
    public int contarPorTipo(String tipo) {
        int contador = 0;
        for (Pedido pedido : pedidos) {
            if (pedido.getTipoPlato().equalsIgnoreCase(tipo)) {
                contador++;
            }
        }
        return contador;
    }
}