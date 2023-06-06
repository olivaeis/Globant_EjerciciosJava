package Guia7;
import java.util.Scanner;
/**
 *
 * @author Flavia
 * 1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
public class Ejercicio1 { 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar dos numeros enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
                
        int num3 = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + num3);
                
   

    }
}
