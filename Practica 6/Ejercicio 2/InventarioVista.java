import java.util.List;
import java.util.Scanner;
public class InventarioVista {
    private Scanner scanner = new Scanner(System.in);
    public String pedirNombre() {
        System.out.print("Nombre: ");
        return scanner.nextLine();
    }
    public int pedirCantidad() {
        System.out.print("Cantidad: ");
        return Integer.parseInt(scanner.nextLine());
    }
    public String pedirTipo() {
        System.out.print("Tipo (Arma/Poción): ");
        return scanner.nextLine();
    }
    public String pedirDescripcion() {
        System.out.print("Descripción: ");
        return scanner.nextLine();
    }
    public int pedirPosicion() {
        System.out.print("Posición: ");
        return Integer.parseInt(scanner.nextLine());
    }
    public void mostrarInventario(List<Item> items) {
        System.out.println("\n--- INVENTARIO ---");
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            System.out.println(
                    i + ". " +
                    item.getNombre() +
                    " - " +
                    item.getCantidad() +
                    " - " +
                    item.getTipo()
            );
        }
    }
    public void mostrarDetalle(Item item) {
        if (item == null) {
            System.out.println("Item no encontrado.");
        } else {
            System.out.println("\n--- DETALLE ---");
            System.out.println("Nombre: " + item.getNombre());
            System.out.println("Cantidad: " + item.getCantidad());
            System.out.println("Tipo: " + item.getTipo());
            System.out.println(
                    "Descripción: " +
                    item.getDescripcion()
            );
        }
    }
    public void mostrarMenu() {
        System.out.println("\n--- INVENTARIO ---");
        System.out.println("1. Agregar item");
        System.out.println("2. Ver inventario");
        System.out.println("3. Buscar item");
        System.out.println("4. Eliminar item");
        System.out.println("5. Usar item");
        System.out.println("6. Salir");
    }
    public String pedirOpcion() {
        System.out.print("Opción: ");
        return scanner.nextLine();
    }
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}