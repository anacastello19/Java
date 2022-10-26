package Clases;

public class PruebaPersona {
    public static void main(String[] args) {
        java persona1= new java (); //Lamamos al contructor
        persona1.nombre  = ""; 
        persona1.apellido  = "";
        persona1.obtenerInformacion();
        
        java persona2= new java (); 
        System.out.println("persona dos="+persona2);
        System.out.println("Persona uno="+ persona1);
        persona2.obtenerInformacion();
        persona2.apellido= "Castello";
        persona2.nombre= "Ana;"
              
    }
}
