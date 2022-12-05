
package test;

public class TestArreglos {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) { //lado derecho, instanciamos un objeto de tipo object
        int edades []= new int [3];// el lado izq. declaramos la variable
        System.out.println("edades: " + edades);
         
        edades[0]=17;
        System.out.println("edades 0 = " + edades[0]);
       
         edades[1]=22;
        System.out.println("edades 1= " + edades[1]);
        
        edades[2]=23;
        System.out.println("edades3 = " + edades[3]);
        String i = null;
        
        //edades[3]=33;//Fera de rango, error en tiempo de ejecucio
        //for (int i =0; i < edades.length; i++) {
          //System.out.println("edades y sus elementos"+i+": "+edades[i]);}
        
    }
}
