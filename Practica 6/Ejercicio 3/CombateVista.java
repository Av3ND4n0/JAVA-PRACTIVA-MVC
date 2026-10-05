import java.util.List;
import java.util.Scanner;
public class CombateVista {
    private Scanner scanner = new Scanner(System.in);
    public int pedirEnemigo() {
        System.out.print("Seleccione enemigo: ");
        return Integer.parseInt(scanner.nextLine());
    }
    public void mostrarEstado(
            Jugador jugador,
            List<Enemigo> enemigos) {
        System.out.println("\n--- ESTADO DEL COMBATE ---");
        System.out.println("Jugador: " + jugador.getNombre() + " | Salud: " + jugador.getSalud());
        for (int i = 0; i < enemigos.size(); i++) {
            Enemigo enemigo = enemigos.get(i);
            System.out.println(i + ". " + enemigo.getNombre() + " | Salud: " + enemigo.getSalud());
        }
    }
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    public void mostrarMenu() {
        System.out.println("\n--- COMBATE ---");
        System.out.println("1. Atacar enemigo");
        System.out.println("2. Ver estado");
        System.out.println("3. Salir");
    }
    public String pedirOpcion() {
        System.out.print("Opción: ");
        return scanner.nextLine();
    }
}