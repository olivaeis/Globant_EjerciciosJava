package Guia7;
import java.util.Scanner;
/**
 * @author Flavia
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introducir un numero positivo que funcione como limite");
        int lim = leer.nextInt();
        int suma = 0;
        
        while (suma<=lim) {
            System.out.println("Ingrese un valor a sumar");
            int num = leer.nextInt();
            suma = suma + num;
        }
        
        System.out.println("El valor límite ingresado es: "+ lim+ " y el valor que supera este limite es: "+suma);
    }
    
}
