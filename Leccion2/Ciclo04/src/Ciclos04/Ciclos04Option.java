/*
Ejercicio 4:
Pedir un numero hasta qie se teclee un nugativo,
mostrar cuantos numeros se han introducido.
Lo hacemos primero con la clase Scanner
Luego lo hacemos con la clase JOptiopnPane
 */
package Ciclos04;

import javax.swing.JOptionPane;

public class Ciclos04Option {
    public static void main(String[] args) {
        int numero, conteo =0;
     
        String JOpcionPane = null;
        numero = Integer.parseInt(JOpcionPane.showInputDiaglog("Digite un numero positivo:"));
        while(numero >= 0){
            JOptionPane.showInternalMessageDialog(numero +" es positivo"+"El numero");
            conteo++;
            System.out.println("Digite otro numero");
            numero= Integer.parseInt(entrada.nextLine());
           }
        System.out.println("A ingresado "+conteo+" numeros positivos");
    }
    }

}
