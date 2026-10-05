import java.util.List;
import java.util.Scanner;
public class PedidoVista2 {
    private Scanner scanner = new Scanner(System.in);
    public String solicitarNombre() {
        System.out.print("Ingrese el nombre del plato: ");
        return scanner.nextLine();
    }
    public String solicitarTipo() {
        System.out.print("Ingrese el tipo de plato: ");
        return scanner.nextLine();
    }
    public int solicitarPosicion() {
        System.out.print("Ingrese la posición del pedido: ");
        return Integer.parseInt(scanner.nextLine());
    }
    public String solicitarTexto() {
        System.out.print("Ingrese nombre o tipo a buscar: ");
        return scanner.nextLine();
    }
    public void mostrarPedidos(List<Pedido> pedidos) {
        System.out.println("\n--- PEDIDOS ---");
        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos.");
        } else {
            for (int i = 0; i < pedidos.size(); i++) {
                System.out.println(i + ". " + pedidos.get(i).getNombrePlato() + " - " + pedidos.get(i).getTipoPlato());
            }
        }
    }
    public void mostrarMenu() {

        System.out.println("\n--- MENU ---");
        System.out.println("1. Agregar pedido");
        System.out.println("2. Mostrar pedidos");
        System.out.println("3. Eliminar pedido");
        System.out.println("4. Actualizar pedido");
        System.out.println("5. Buscar pedido");
        System.out.println("6. Contar pedidos");
        System.out.println("7. Salir");
    }
    public String solicitarOpcion() {
        System.out.print("Ingrese una opción: ");
        return scanner.nextLine();
    }
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}