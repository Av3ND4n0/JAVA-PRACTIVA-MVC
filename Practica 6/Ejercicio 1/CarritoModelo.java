import java.util.ArrayList;
import java.util.List;
public class CarritoModelo {
    private List<Producto> productos;
    private List<Producto> carrito;
    private List<String> historial;
    public CarritoModelo() {
        productos = new ArrayList<>();
        carrito = new ArrayList<>();
        historial = new ArrayList<>();
    }
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    public List<Producto> getProductos() {
        return productos;
    }
    public void agregarAlCarrito(int posicion) {
        if (posicion >= 0 && posicion < productos.size()) {
            Producto producto = productos.get(posicion);
            carrito.add(producto);
        }
    }
    public List<Producto> getCarrito() {
        return carrito;
    }
    public void eliminarDelCarrito(int posicion) {
        if (posicion >= 0 && posicion < carrito.size()) {
            carrito.remove(posicion);
        }
    }
    public double calcularSubtotal() {
        double subtotal = 0;
        for (Producto producto : carrito) {
            subtotal += producto.getPrecio() * producto.getCantidad();
        }
        return subtotal;
    }
    public double calcularDescuento() {
        double subtotal = calcularSubtotal();
        if (subtotal >= 100) {
            return subtotal * 0.10;
        }
        return 0;
    }
    public double calcularEnvio() {
        if (calcularSubtotal() >= 150) {
            return 0;
        }
        return 10;
    }
    public double calcularTotal() {
        return calcularSubtotal() - calcularDescuento() + calcularEnvio();
    }
    public void realizarCompra() {
        double total = calcularTotal();
        historial.add("Compra realizada. Total: S/ " + total);
        carrito.clear();
    }
    public List<String> getHistorial() {
        return historial;
    }
}