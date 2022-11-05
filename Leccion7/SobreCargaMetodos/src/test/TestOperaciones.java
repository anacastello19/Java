
package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        var rdo= Operaciones.sumar(7,9);
        System.out.println("Resulltado de la suma: "+rdo);
        var rdo2 = Operaciones.sumar(5.0, 7);
        System.out.println("Resultado = " +rdo2 );
        
        var rdo3= Operaciones.sumar(8, 6L);
        System.out.println("rdo3 = " + rdo3);
    }
    
}
