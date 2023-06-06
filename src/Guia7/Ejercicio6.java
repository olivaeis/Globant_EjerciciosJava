package Guia7;
import java.util.Scanner;
        
/**
 *6. Crear un programa que dado un numero determine si es par o impar.
 * @author Flavia
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar un numero");
        int num = leer.nextInt();
        
        if (num%2==0) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }
                
    }
    
}
