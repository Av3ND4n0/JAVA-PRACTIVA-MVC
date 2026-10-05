public class CarritoControlador {
    private CarritoModelo modelo;
    private CarritoVista vista;
    public CarritoControlador(
            CarritoModelo modelo,
            CarritoVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    public void agregarProducto() {
        String nombre = vista.pedirNombre();
        double precio = vista.pedirPrecio();
        int cantidad = vista.pedirCantidad();
        Producto producto =
                new Producto(nombre, precio, cantidad);
        modelo.agregarProducto(producto);
        vista.mostrarMensaje("Producto agregado.");
    }
    public void agregarAlCarrito() {
        int posicion = vista.pedirPosicion();
        modelo.agregarAlCarrito(posicion);
        vista.mostrarMensaje("Producto agregado al carrito.");
    }
    public void eliminarDelCarrito() {
        int posicion = vista.pedirPosicion();
        modelo.eliminarDelCarrito(posicion);
        vista.mostrarMensaje("Producto eliminado.");
    }
    public void mostrarTotal() {
        vista.mostrarMensaje(
                "Subtotal: S/ " + modelo.calcularSubtotal()
        );
        vista.mostrarMensaje(
                "Descuento: S/ " + modelo.calcularDescuento()
        );
        vista.mostrarMensaje(
                "Envío: S/ " + modelo.calcularEnvio()
        );
        vista.mostrarMensaje(
                "Total: S/ " + modelo.calcularTotal()
        );
    }
    public void iniciar() {
        String opcion;
        do {
            vista.mostrarMenu();
            opcion = vista.pedirOpcion();
            switch (opcion) {
                case "1":
                    agregarProducto();
                    break;
                case "2":
                    vista.mostrarProductos(
                            modelo.getProductos()
                    );
                    break;
                case "3":
                    agregarAlCarrito();
                    break;
                case "4":
                    vista.mostrarCarrito(
                            modelo.getCarrito()
                    );
                    break;
                case "5":
                    eliminarDelCarrito();
                    break;
                case "6":
                    mostrarTotal();
                    break;
                case "7":
                    modelo.realizarCompra();
                    vista.mostrarMensaje("Compra realizada.");
                    break;
                case "8":
                    vista.mostrarHistorial(
                            modelo.getHistorial()
                    );
                    break;
                case "9":
                    vista.mostrarMensaje("Saliendo...");
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida.");
            }
        } while (!opcion.equals("9"));
    }
}
