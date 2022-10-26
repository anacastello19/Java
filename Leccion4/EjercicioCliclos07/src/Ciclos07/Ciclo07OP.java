/*
Ejercicio 7: Pedi un numero hasta que se introduzca uno negativo
y calcular la media
 */
package Ciclos07;

import javax.swing.JOptionPane;

public class Ciclo07OP {
      public static void main(String[] args) {
       
        int numero, suma =0;
        do{
            System.out.println ("Digite un numero: ");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            suma+= numero;
        }while (numero >=0);
        JOptionPane.showMessageDialog(null,"La suma de todos los numeros ingressado es: "+suma);
    }
        
        
    }
    

