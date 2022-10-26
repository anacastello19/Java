package ejercicio2;

//import java.util.Scanner;

import java.util.Scanner;


public class ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        float salarioHora, salarioTotal;
        int horaSemanales;
        
        System.out.println("Digite las horas semanales trabajadas");
        horaSemanales = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el salario que cobra por ahora");
        salarioHora = Float.parseFloat(entrada.nextLine());
        
        salarioTotal = horaSemanales * salarioHora;
        System.out.println("El salario semanal es: US$"+ salarioTotal);
        
         
    }

}
