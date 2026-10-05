public class Item {
    private String nombre;
    private String tipo;
    private int dano;
    public Item(String nombre, String tipo, int dano) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.dano = dano;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public int getDano() {
        return dano;
    }
}
