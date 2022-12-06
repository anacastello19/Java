package ar.com.codesystem.ventas.test;

import ar.com.codesystem.*;

public class VentaTest {

    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 950.00);
        Producto producto2 = new Producto("Campera", 2990.00);
        Producto producto3= new Producto("Remera", 333.00);
        Producto producto4 = new Producto("Short",3000.00);
        Producto producto5 = new Producto("Bizera",1500.00);
        Producto producto6 = new Producto("Jeans",5000.00);
        Producto producto7 = new Producto("Camisa",3500.00);
        Producto producto8 = new Producto("Vestido",2500.00);
        Producto producto9 = new Producto("Mangas cortas",1500.00);
        Producto producto10 = new Producto("Mono",3000.00);
        Producto producto11 = new Producto("Medias",500.00);
        Producto producto12 = new Producto("Bikini",4000.00);
        Orden orden1 = new Orden();
        Orden orden2= new Orden();
        //Agrefamos productos al arreglos
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        
        orden2.agregarProducto(producto9);
        orden2.agregarProducto(producto10);
        orden2.mostrarOrden();
        
        /*
        Tarea: Crear objetos de tipo Poducto=10
        Crear mas objetos de tipo oden
        */
    }
}
