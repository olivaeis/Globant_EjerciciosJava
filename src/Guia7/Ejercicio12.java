package Guia7;
import java.util.Scanner;

/**
 * @author Flavia
 */
public class Ejercicio12 {

    public static void main(String[] args) {
  
        int correctas = 0;
        int incorrectas = 0;
        String cad;
        do{
            System.out.println("Ingresar la cadena");
            Scanner leer = new Scanner(System.in);
            cad = leer.nextLine();
            if (verificacion(cad)) {
                correctas++;
            } else if (!(verificacion(cad)) && !(cad.equals("&&&&&"))){
                incorrectas++;
            } 
        }while (!cad.equals("&&&&&"));
        
        System.out.println("Cantidad de cadenas correctas: "+ correctas);
        System.out.println("Cantidad de cadenas incorrectas: " + incorrectas);

    }
    public static boolean verificacion(String cad){
        int longitud = cad.length();
        return (longitud <= 5 && (cad.substring(0,1)).equals("X") && (cad.substring(longitud-1,longitud)).equals("O"));
    }
}
