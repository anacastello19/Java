/*
Ejercicio3:
Leer 5 numeros por teclado, almacenarlos en un arreglos
y a continucacion realizar la media de los numeros positivo,
la media de los negativos y contar el numero de ceros.
 */
package arreglos_ejercicio_3;

import java.util.Scanner;

public class Arreglos_ejercicio_3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        float negativos = 0, positivos = 0, mediaNegativos, mediaPositivos;
        int conteo0 = 0;
        int conteo_negativos = 0;
        int conteo_positivos = 0;

        System.out.println("Guardamos los elementos del arreglo: ");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ".Digite in numero: ");
            numeros[i] = entrada.nextFloat();
            if (numeros[i] > 0) {
                positivos += numeros[i];
                conteo_positivos++;
            } else if (numeros[i] < 0) {
                negativos += numeros[i];
                conteo_negativos++;
            } else {
                conteo0++;
            }
            if (conteo_positivos == 0) {
                System.out.println("\nNo se puede sacar la media de los numeros positivos");
            } else {
                mediaPositivos = positivos / conteo_positivos;
                System.out.println("\nLa media de los numeros positivos es: " + mediaPositivos);
            }
            if(conteo_negativos==0){
                System.out.println("\nNo se puede sacar la media de los numeros negativos");
                
            }
            else{
                mediaNegativos= negativos/conteo_negativos;
                System.out.println("La media de los numeros negativos es: "+mediaNegativos);
            }
            
            System.out.println("La cantidade de numeros con cero son: "+conteo0);

        }

    }

}
