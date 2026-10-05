import java.util.List;
import java.util.Scanner;
public class PedidoVista3 {
    private Scanner scanner = new Scanner(System.in);
    public String solicitarNombre() {
        System.out.print("Nombre del plato: ");
        return scanner.nextLine();
    }
    public String solicitarTipo() {
        System.out.print("Tipo del plato: ");
        return scanner.nextLine();
    }
    public int solicitarPosicion() {
        System.out.print("Posición del pedido: ");
        return Integer.parseInt(scanner.nextLine());
    }
    public void mostrarPedidos(List<Pedido> pedidos) {
        System.out.println("\n--- PEDIDOS ---");
        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos.");
        } else {
            for (int i = 0; i < pedidos.size(); i++) {
                Pedido pedido = pedidos.get(i);
                System.out.println(
                        i + ". " +
                        pedido.getNombrePlato() +
                        " - " +
                        pedido.getTipoPlato() +
                        " - " +
                        pedido.getEstado()
                );
            }
        }
    }
    public void mostrarMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Agregar pedido");
        System.out.println("2. Mostrar pedidos");
        System.out.println("3. Completar pedido");
        System.out.println("4. Mostrar pendientes");
        System.out.println("5. Mostrar completos");
        System.out.println("6. Contar pendientes");
        System.out.println("7. Ver historial");
        System.out.println("8. Eliminar pedido");
        System.out.println("9. Salir");
    }
    public String solicitarOpcion() {
        System.out.print("Opción: ");
        return scanner.nextLine();
    }
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
