/*Ejercicio6: Pedir numeros hasta que se teclee un 0,
mostrar la suma de todos los numeros introducidos.
*/
package ciclos06;

import javax.swing.JOptionPane;

public class Ciclo06Open {
    public static void main(String[] args) {
       
        int numero,suma=0;
        do{ 
            System.out.println("Digite un numero: ");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            suma+= numero;
        }while (numero !=0);
        JOptionPane.showMessageDialog(null, "La suma de todos los numeros ingressado es:  "+suma);
    }
}
