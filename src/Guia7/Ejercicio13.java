package Guia7;
import java.util.Scanner;
/**
 * @author Flavia
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar un numero");
        int num = leer.nextInt();
                
        for (int i = 0; i < num-1; i++) {
            for (int j = 0; j < num-1; j++) {
              if (i == 0 || i == num-1){
                  System.out.print("*");
                  
              }   
            }
            
        }
    }
    
}
