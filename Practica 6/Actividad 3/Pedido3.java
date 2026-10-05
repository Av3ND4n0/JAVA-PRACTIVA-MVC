public class Pedido3 {
    private String nombrePlato;
    private String tipoPlato;
    private String estado;
    public Pedido3(String nombrePlato, String tipoPlato) {
        this.nombrePlato = nombrePlato;
        this.tipoPlato = tipoPlato;
        this.estado = "Pendiente";
    }
    public String getNombrePlato() {
        return nombrePlato;
    }
    public String getTipoPlato() {
        return tipoPlato;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}