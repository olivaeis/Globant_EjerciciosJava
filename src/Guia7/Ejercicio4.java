package Guia7;
import java.util.Scanner;           
/**
 *4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * @author Flavia
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados centígrados");
        int temp = leer.nextInt();
        
        float fahr = 32 + (9 * temp / 5);
        System.out.println("El equivalente a " + temp + " °C es " + fahr + "Fahrenheit");
           
        
    }
    
}
