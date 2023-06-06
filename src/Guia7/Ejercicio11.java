package Guia7;

import java.util.Scanner;

/**
 * @author Flavia
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        boolean salir = false;

        while (salir == false) {
            salir = eleccion(num1, num2);
        }
    }

    public static boolean eleccion(int num1, int num2) {
        mostrarMenu();
        Scanner leer = new Scanner(System.in);
        int opcion = leer.nextInt();
        boolean salir = false;

        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma es: " + sumar(num1, num2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + restar(num1, num2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es: " + multiplicar(num1, num2));
                break;
            case 4:
                System.out.println("El resultado de la división es: " + dividir(num1, num2));
                break;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                String confirmar = leer.next();

                if (confirmar.equalsIgnoreCase("S")) {
                    System.out.println("Fin del programa");
                    salir = true;
                }
                break;

            default:
                System.out.println("Opcion inválida.");
        }
        return salir;
    }

    public static void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija opción:");
    }

    public static int sumar(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }

    public static int restar(int num1, int num2) {
        int resta = num1 - num2;
        return resta;
    }

    public static int multiplicar(int num1, int num2) {
        int multi = num1 * num2;
        return multi;
    }

    public static int dividir(int num1, int num2) {
        int div = num1 / num2;
        return div;
    }

}
