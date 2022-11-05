/*Usos de la palabra final
Esta palabra tiene diferentes significados 
dependiendo donde se aplique:
Variables: Evita cambiar el valor que almacena la variable
Metodos: Evita que se modifique la definicion o 
el  comportamiento de un metodo desde una subclase(hija)
clases: Evita que se creen clases hijas
Otras caracteristicas es que normalmente, cuando trabajamos
con variables se combina con el modificador de acceso
estatico para convertur una variable en una constate, es decir
que no se puede modificar su valor, el ejemplo de esto 
es la clase Math en la cual todos sus atributos son tipo static
y final, es por esto que la variable pi* se conoce como una constante*/
package test;

import domian.Persona;

public class Testfinal {
    public static void main(String[] args) {
        final int miDni=15132165;
        System.out.println("miDni = " + miDni);
        //Persona.CONSTANTE_AQUI=9;//No se modifica
        System.out.println(   "Mi atributo constante es"+ Persona.CONSTANTE_AQUI);
        
        final Persona persona1= new Persona();
        //persona1 = new Persona(); No se puede asignar una nueva referencia
        persona1.setNombre(" Ana Virginia" );
        System.out.println("Persona 1 nombre"+persona1.getNombre());
        persona1.setNombre("Lili");
        System.out.println("Nombre de persona1" + persona1.setNombre() );
    }
}
