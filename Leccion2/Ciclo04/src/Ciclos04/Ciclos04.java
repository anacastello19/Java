/*
Ejercicio 4:
Pedir un numero hasta que se teclee un nugativo,
mostrar cuantos numeros se han introducido.
Lo hacemos primero con la clase Scanner
Luego lo hacemos con la clase JOptiopnPane

 */
package Ciclos04;

import java.util.Scanner;

public class Ciclos04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, conteo =0;
        System.out.println("Digite un numero positivo:" );
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >= 0){
            System.out.println("El numero" +numero+" es positivo");
            conteo++;
            System.out.println("Digite otro numero");
            numero= Integer.parseInt(entrada.nextLine());
           }
        System.out.println("A ingresado "+conteo+" numeros positivos");
    }
    
}
