
package ciclowhile;


public class EjercicioWhile01 {
    public static void main(String[] args) {
        var conteo =0;//Interdetencia de tipo
        while(conteo<3){
            System.out.println("conteo="+conteo);
            conteo++;//Vamos aumentando le uno las variables
        }
        var contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
            
        }while (contador<=7);
        for ( var contando = 0; contando <7 ; contando++ ) {
            if(contando %2==0){
            System.out.println("contando = " + contando);
            break;
       
            }
            System.out.println("contando = " + contando);
        }
    }
}
