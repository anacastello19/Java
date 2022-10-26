/*Ejercicio 3:
Leer numeros hasta que se introduzca un cero
Para cada uno inidicar si es par o impar.
Primero la haremos con la clase scanner 
Luego con la clase JOptionPane
*/
package ClaseCiclo03;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio03 {
    public static void main(String[] args) {
        int numero;
 
        numero = Integer.parseInt(JOptcionPane.showInputDialog("Digite un numero"));
        while(numero !=0){//Mientras el numero sea igual a cero o positivo
            if(numero%2==0){
                    JOptionPane.showMessageDialog(null,"El numero ingresado " +numero+ "es Par" );
            }
            else{
                    JOptionPane.showMessageDialog(null, "El numero ingresado " +numero +"es IMPAR");
            }
            System.out.println("Digite otro numero " );
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
            }
        JOptionPane.showMessageDialog(null, "El numero ingrasado es" + numero+"finalizar el programa");
    }
}
