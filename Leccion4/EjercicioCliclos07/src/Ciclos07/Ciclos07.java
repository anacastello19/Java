/*
Ejercicio 7: Pedi un numero hasta que se introduzca uno negativo
y calcular la media
 */
package Ciclos07;

import java.util.Scanner;

public class Ciclos07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, suma =0;
        do{
            System.out.println ("Digite un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            suma+= numero;
        }while (numero >=0);
        System.out.println("\nLa suma de todos los numeros ingressado es: "+suma);
    }
        
        
    }
    

