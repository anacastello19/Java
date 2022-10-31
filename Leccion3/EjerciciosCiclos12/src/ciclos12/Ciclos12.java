/*
 Ejercicio 12: Pedir un numero y calcular su factorial
Hacerlo con las dos clases, Scannner y JOptionPane
 */
package ciclos12;
//import java.swing.Scanner:
import javax.swing.JOptionPane;
public class Ciclos12 {
    public static void main(String[] args) {
        //Scanner entrada = new Scanner
        long factorial=1;
        //System.out.println("Digite un numero");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        for (int i=1; i<=numero; i++){
            factorial *=1;
        }
        //System.out.println("\nEl factoriL  del numero ingresado es: "+factorial);
        JOptionPane.showMessageDialog(null, "El factorial del numero ingresado es: "+factorial);
    }
    
}
