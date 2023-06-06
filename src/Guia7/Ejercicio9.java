package Guia7;
import java.util.Scanner;
/**
 *9. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
 * @author Flavia
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar una cadena");
        String cad = leer.nextLine();
        
        int longitud = cad.length();
        cad = cad.toUpperCase();
        
        String letra1 = cad.substring(0,1);
        //String letra2 = cad.substring(longitud-1);
        //System.out.println("primera letra: " + letra1 + " ultima letra: " + letra2 + " longitud cadena: " + longitud);
            
        
        if (letra1.equals("A")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto.");
        }
    }
    
}
