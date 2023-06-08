package Guia7;
import java.util.Scanner;
/**
 * * @author Flavia
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar la cantidad de euros a convertir");
        int cant = leer.nextInt();
        
        System.out.println("Ingresar la moneda a convertir: dolar - yen - libra");
        String mon = leer.next();
        
        mon = mon.toLowerCase();
        conversion(cant, mon);
    }
    
    public static void conversion(int cantidad, String moneda){
        switch (moneda) {
            case "dolar":
                System.out.println("El cambio de "+ cantidad + "euro/s es " + 1.28611*cantidad + " dolar/es.");
                break;
            case "yen":
                System.out.println("El cambio de "+ cantidad + " euro/s es " + 129.852*cantidad + " yen/es.");
                break;
            case "libra":
                System.out.println("El cambio de "+ cantidad + "euro/s es " + 0.86*cantidad + " libra/s.");
                break;    
            default:
                System.out.println("La moneda ingresada es inválida.");
        }
    }
}
