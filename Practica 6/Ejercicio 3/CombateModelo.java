import java.util.ArrayList;
import java.util.List;
public class CombateModelo {
    private Jugador jugador;
    private List<Enemigo> enemigos;
    public CombateModelo(Jugador jugador) {
        this.jugador = jugador;
        enemigos = new ArrayList<>();
    }
    public void agregarEnemigo(Enemigo enemigo) {
        enemigos.add(enemigo);
    }
    public Jugador getJugador() {
        return jugador;
    }
    public List<Enemigo> getEnemigos() {
        return enemigos;
    }
    public void atacarEnemigo(int posicion) {
        if (posicion >= 0 && posicion < enemigos.size()) {
            Enemigo enemigo = enemigos.get(posicion);
            int dano = jugador.atacar();
            enemigo.recibirDanio(dano);
        }
    }
    public void atacarJugador(int posicion) {
        if (posicion >= 0 && posicion < enemigos.size()) {
            Enemigo enemigo = enemigos.get(posicion);
            int dano = enemigo.atacar();
            jugador.recibirDanio(dano);
        }
    }
}