/*Ejercicio 3:
Leer numeros hasta que se introduzca un cero
Para cada uno inidicar si es par o impar.
Primero la haremos con la clase scanner 
Luego con la clase JOptionPane
*/
package ClaseCiclo03;
        
import java.util.Scanner;

public class Ciclos03 {
public static void main(String[] args) {  
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite un numero:");   
        numero = Integer.parseInt(entrada.nextLine());
        while(numero !=0){//Mientras el numero sea igual a cero o positivo
            if(numero%2==0){
                System.out.println("El numero ingresado " +numero+ "es Par" );
            }
            else{
                System.out.println("El numero ingresado " +numero +"es IMPAR" );
            }
            System.out.println("Digite otro numero " );
            numero = Integer.parseInt(entrada.nextLine());
            }
        System.out.println("El numero ingrasado es" + numero+"finalizar el programa");
       
}
    
}
