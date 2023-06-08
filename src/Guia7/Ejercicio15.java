package Guia7;

/**
 * @author Flavia
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        int[] vector = new int[100];
        vector = llenarVector(vector);
        for (int i = 0; i < 100; i++) {
            System.out.print(vector[i] + ", ");
            
        }
         
   
    }
    public static int[] llenarVector(int[] vector){
        int cont = 100;
        for (int i = 0; i < 100; i++) {
            vector[i]= cont;
            cont = cont -1;
        }
        return vector;
    }
}
