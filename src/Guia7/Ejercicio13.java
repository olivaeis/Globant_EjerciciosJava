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

        for (int fila = 0; fila < num; fila++) {
            for (int col = 0; col < num; col++) {
                if (fila == 0 || fila == num - 1 || col == 0 || col == num - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

}
