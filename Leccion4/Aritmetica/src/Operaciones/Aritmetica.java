package Operaciones;

public class Aritmetica {

    //Atributos de la clase 
    int a;
    int b;

    //El contructor es un metodo especial
    public Aritmetica() { //Contructor 1 vacio
        System.out.println("Se esta ejecutando este contructor numero uno");
    }
     //Estamos viendo sobre carfa de contructores
    public Aritmetica(int a, int b) {//Contructor 2
        this.a= a;
        this.b = b;
        System.out.println("Se esta ejecutando este contructor numero dos");
}
    //Metodo 
    public void sumarNumero() {
        int resultado = a + b;
        System.out.println("Resultado: " + resultado);

    }

    public int sumarConRetorno() {
        //int resultado = a + b;
        return a + b;
    }

    public int sumarConArgumentos(int a, int b) {
        this.a = a; //El argumento se a asignado al atributo 
        this.b = b;
        //return a + b;
        return sumarConRetorno();
    }
}
