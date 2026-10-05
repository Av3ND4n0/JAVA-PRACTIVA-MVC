import java.util.ArrayList;
import java.util.List;
public class Jugador {
    private String nombre;
    private int salud;
    private int nivel;
    private List<Item> inventario;
    private Item objetoEquipado;
    public Jugador(
            String nombre,
            int salud,
            int nivel) {
        this.nombre = nombre;
        this.salud = salud;
        this.nivel = nivel;
        inventario = new ArrayList<>();
    }
    public void agregarItem(Item item) {
        inventario.add(item);
    }
    public void equiparItem(int posicion) {
        if (posicion >= 0 && posicion < inventario.size()) {
            objetoEquipado = inventario.get(posicion);
        }
    }
    public int atacar() {
        if (objetoEquipado != null) {
            return objetoEquipado.getDano() + nivel;
        } else {
            return 5;
        }
    }
    public void recibirDanio(int dano) {
        salud -= dano;
        if (salud < 0) {
            salud = 0;
        }
    }
    public List<Item> getInventario() {
        return inventario;
    }
    public String getNombre() {
        return nombre;
    }
    public int getSalud() {
        return salud;
    }
    public int getNivel() {
        return nivel;
    }
    public Item getObjetoEquipado() {
        return objetoEquipado;
    }
}