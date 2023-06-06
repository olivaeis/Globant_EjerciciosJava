package Guia7;
import java.util.Scanner;
/**
 * @author Flavia
 */
public class Ejercicio3 {
    /**
 
     * 3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        String mayus = frase.toUpperCase();
        String minus = frase.toLowerCase();
        System.out.print("La frase en mayúscula: " + mayus);
        System.out.println("");
        System.out.print("La frase en minúscula: " + minus);
       
                
                
        
                
       
        
        
    }
    
}
