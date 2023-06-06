package Guia7;
import java.util.Scanner;
/**
 * @author Flavia
 */
public class masEjdeLaGuiateorica {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una frase.");
        String frase = leer.nextLine();
        frase = frase.toLowerCase();
       
        System.out.println("La frase codificada es: " + codificar(frase));
       
    }
    
    public static String codificar(String frase){
        String letra;
        String fraseVacia = "";
               
        for (int i = 0; i <= frase.length()-1; i++){
            letra = frase.substring(i, i+1);
            switch (letra) {
                case "a":
                    fraseVacia = fraseVacia.concat("@");
                    break;
                case "e":
                    fraseVacia = fraseVacia.concat("#");
                    break; 
                case "i":
                    fraseVacia = fraseVacia.concat("$");
                    break;
                case "o":
                    fraseVacia = fraseVacia.concat("%");
                    break;
                case "u":
                    fraseVacia = fraseVacia.concat("*");
                    break;
                default:
                    fraseVacia = fraseVacia.concat(letra);
            }
        }
        return fraseVacia;
    }
}



