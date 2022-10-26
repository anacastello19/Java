package test;

import dominio.Persona;

public class PruebaPersona {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo", 57.000, false);
        System.out.println("Nombre de persona1: "+persona1.getNombre());
        Persona persona2= new Persona ("Ariel", 150.000, false);
        //Modificar persona
        persona1.setNombre("Juan Ignacio");
        System.out.println("Persona1 su nombre es: "+ persona1.getNombre());
        System.out.println("Persona1 su sueldo es: "+ persona1.getSueldo());
       // System.out.println("Persona1 para obtener el boolena"persona1.isEliminado());
        //Tarea: crear otro objeto de tipo persona. asignamos valores de manera inicial
        //Imprimir y modificar los calores, volver a imprimir
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Nombre de persona2: "+persona2.getNombre());
        System.out.println("Sueldo de perosna2: "+persona2.getSueldo());
        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
        persona2.setSueldo(55000);
        System.out.println("Sueldo de persona2: " + persona2.getSueldo());
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Persona1: "+ persona1.toString());
        System.out.println("Persona2: "+persona2.toString());
        

    }

}
