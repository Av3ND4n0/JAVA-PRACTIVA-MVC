import java.util.List;
import java.util.Scanner;
public class PedidoVista {
    private Scanner scanner = new Scanner(System.in);
    public String solicitarNombrePlato() {
        System.out.print("Ingrese el nombre del plato: ");
        return scanner.nextLine();
    }
    public void mostrarPedidos(List<Pedido> pedidos) {
        System.out.println("\n--- PEDIDOS ---");
        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos.");
        } else {
            for (Pedido pedido : pedidos) {
                System.out.println("Plato: " + pedido.getNombrePlato());
            }
        }
    }
    public void mostrarMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Agregar pedido");
        System.out.println("2. Mostrar pedidos");
        System.out.println("3. Salir");
    }
    public String solicitarOpcion() {
        System.out.print("Ingrese una opción: ");
        return scanner.nextLine();
    }
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
