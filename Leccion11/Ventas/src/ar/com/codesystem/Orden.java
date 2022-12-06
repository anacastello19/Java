package ar.com.codesystem;

public class Orden {

    private int idOrden;
    private Producto producto[];//Declaramos arreglo
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    //Constructor vacio
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.producto = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            this.producto[this.contadorProductos++] = producto;

        } else {
            System.out.println("Se ha propuesto el maximo de producto " + Orden.MAX_PRODUCTOS);
        }
    }

    public double calcularTotal() {
        double total = 0;//Variable temporal
        for (int i = 0; i < this.contadorProductos; i++) {
            Producto producto = this.producto[i];
            total += producto.getPrecio();
            total += this.producto[i].getIdProducto();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("Id orden: " + idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("El total de la orden es:  $" + totalOrden);
        System.out.println("Los productos de la orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.producto[i]);
        }
    }
}
