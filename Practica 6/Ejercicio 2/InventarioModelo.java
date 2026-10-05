import java.util.ArrayList;
import java.util.List;
public class InventarioModelo {
    private List<Item> items;
    public InventarioModelo() {
        items = new ArrayList<>();
    }
    public void agregarItem(Item item) {
        items.add(item);
    }
    public void eliminarItem(int posicion) {
        if (posicion >= 0 && posicion < items.size()) {
            items.remove(posicion);
        }
    }
    public List<Item> obtenerItems() {
        return items;
    }
    public Item buscarItem(String nombre) {
        for (Item item : items) {
            if (item.getNombre().equalsIgnoreCase(nombre)) {
                return item;
            }
        }
        return null;
    }
}
