
package Guia7;
import java.util.Scanner;

/**
 *8. Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 * @author Flavia
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar cadenas de 8 caracteres");
        String cad = leer.nextLine();
        
        int longitud = cad.length();
        
        if (longitud == 8){
            System.out.println("Correcto.");
        } else {
            System.out.println("Incorrecto.");
        }
    }
    
}

        