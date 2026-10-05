
public class Main {
    public static void main(String[] args) {
        Jugador jugador = new Jugador("Jugador", 100, 1);
        Item espada = new Item("Espada", "Arma", 20);
        jugador.agregarItem(espada);
        jugador.equiparItem(0);
        Enemigo enemigo1 = new Enemigo(
                        "Goblin",
                        50,
                        1,
                        "Normal"
                );
        Enemigo enemigo2 = new Enemigo(
                        "Orco",
                        80,
                        2,
                        "Fuerte"
                );
        CombateModelo modelo = new CombateModelo(jugador);
        modelo.agregarEnemigo(enemigo1);
        modelo.agregarEnemigo(enemigo2);
        CombateVista vista = new CombateVista();
        CombateControlador controlador = new CombateControlador(
                        modelo,
                        vista
                );
        controlador.iniciar();
    }
}