package Guia7;
import java.util.Scanner;
/**
 *
 * @author Flavia
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     * 2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nom = leer.nextLine();
        System.out.println("El nombre ingresado es: " + nom);
                
        
    }
    
    
    
}
