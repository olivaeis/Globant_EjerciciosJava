package Guia7;
import java.util.Scanner;
/**
 *5. Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 * @author Flavia
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar un numero entero");
        int num = leer.nextInt();
        
        int doble = num * 2;
        int triple = num * 3;
        double raizCuadrada = Math.sqrt(num);
        
        System.out.println("El doble es: " + doble + ", el triple es " + triple + " y la raiz cuadrada es " + raizCuadrada + ".");
        
        
                
                
        
    }
    
}
