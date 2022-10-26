//Dos metiodos creados
package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        ///No retorna
        int a=10;//Variables locales
        int b= 7; //Memoria Stack
        miMetodo() ;  //Llamamos el metodo numero
        Aritmetica aritmetica1= new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumero();
        
        
        //Para almacenar un objeto o los atributos se utiliz la memoria heap
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado:  " + resultado);
        
        //
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumento: "+resultado);
       
        System.out.println("Aritmetica a: "+aritmetica1.a);
        System.out.println("Aritmetica b: "+aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("Aritmetica 2="+aritmetica2.a);
        System.out.println("Aritmetica 2="+aritmetica2.b);
        //aritmetica1= null: nunca utilizar esto
        //System.gc();// Metodo para limpiar residuos, no utilizar
        Persona persona = new Persona("Ana", "Castello") ; 
        System.out.println("persona = " + persona);
        System.out.println("Pesona nombre: "+ persona.nombre);
        System.out.println("Persona apellido: "+ persona.apellido);
    }
    
    public static void miMetodo(){
    int a= 10;  //Variable limitada
    System.out.println("Aqui hay otro metodo");
    
    }
}

class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        super ()  ;//Llamada al contructor de la clase Padre object
        //Imprimir imprimir= new Imprimir();
        new Imprimir(). imprimir(this);
        this.apellido= apellido;
        this.nombre= nombre;
        System.out.println("Objeto persona usando this: "+this);
        
    }
}

class Imprimir{
    public class Imprimirs {
            //super() ; //Contructor de la clase padre, para reservar memoria
        }
    public void imprimir (Persona persona){
        System.out.println("Persona desde la clase imprimir"+persona);
        System.out.println("Impresiones del objeto actual (this)"+this);
        
    }

}

