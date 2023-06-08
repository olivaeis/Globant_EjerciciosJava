package Guia7;
import java.util.Scanner;
/**
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 * @author Flavia
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        System.out.println("Ingresar el tamaño del vector");
        Scanner leer = new Scanner(System.in);
        int dim = leer.nextInt();
        int[] vector = new int[dim];
        
        vector = llenarVector(vector, dim);
        
        System.out.println("Ingrese el numero buscado");
        int busq = leer.nextInt();
        
        for (int i = 0; i < dim; i++) {
            if (busq == i){
                
            }
            
        }
        
        
        
        
    }
    public static int[] llenarVector(int[] vector, int dimension){
        for (int i = 0; i < dimension ; i++) {
            int  num = (int) (Math.random()*101);
            vector[i]= num;
        }
        return vector;
    }
}
