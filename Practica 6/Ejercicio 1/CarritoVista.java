import java.util.List;
import java.util.Scanner;
public class CarritoVista {
    private Scanner scanner = new Scanner(System.in);
    public String pedirNombre() {
        System.out.print("Nombre del producto: ");
        return scanner.nextLine();
    }
    public double pedirPrecio() {
        System.out.print("Precio: ");
        return Double.parseDouble(scanner.nextLine());
    }
    public int pedirCantidad() {
        System.out.print("Cantidad: ");
        return Integer.parseInt(scanner.nextLine());
    }
    public int pedirPosicion() {
        System.out.print("Posición: ");
        return Integer.parseInt(scanner.nextLine());
    }
    public void mostrarProductos(List<Producto> productos) {
        System.out.println("\n--- PRODUCTOS ---");
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            System.out.println(i + ". " + producto.getNombre() + " - S/ " + producto.getPrecio() + " - Cantidad: " + producto.getCantidad());
        }
    }
    public void mostrarCarrito(List<Producto> carrito) {
        System.out.println("\n--- CARRITO ---");
        for (int i = 0; i < carrito.size(); i++) {
            Producto producto = carrito.get(i);
            System.out.println(i + ". " + producto.getNombre() + " - S/ " + producto.getPrecio());
        }
    }
    public void mostrarHistorial(List<String> historial) {
        System.out.println("\n--- HISTORIAL ---");
        for (String compra : historial) {
            System.out.println(compra);
        }
    }
    public void mostrarMenu() {
        System.out.println("\n--- CARRITO DE COMPRAS ---");
        System.out.println("1. Agregar producto");
        System.out.println("2. Listar productos");
        System.out.println("3. Agregar producto al carrito");
        System.out.println("4. Ver carrito");
        System.out.println("5. Eliminar del carrito");
        System.out.println("6. Ver total");
        System.out.println("7. Realizar compra");
        System.out.println("8. Ver historial");
        System.out.println("9. Salir");
    }
    public String pedirOpcion() {
        System.out.print("Opción: ");
        return scanner.nextLine();
    }
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
