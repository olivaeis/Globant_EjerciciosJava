
package Guia7;
import java.util.Scanner;
/**
 *
 * @author Flavia
 */
public class ActDeLaGuiaTeorica {

    public static void main(String[] args) {
        
        /*
        Ejercicio 1 y 2
        
        int num1 = 25;
        double decimal = 3.55;
        char letra = 'a';
        byte num = -128;
        String nombre = "Es miercoles";
        boolean bandera = false; 
        int num2 = 5;
        int num3;
        int num4;
        int num5;
        
        *--------------------------------------------------------------*
        Ejercicio 3
        
        num3 = num1 + num2;
        num4 = num1 * num2;
        System.out.println(bandera);
        System.out.println(num3);
        System.out.println(num4);
        
         *--------------------------------------------------------------*
        Ejercicio 4
        
        String nom = "Flavia";
        int edad = 33;
        System.out.print(nom +" " + edad);
  
        *--------------------------------------------------------------*
        Ejercicio 5
        
        boolean check;
        double n;
        char letra1;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Indicar si es verdadero o falso (true/false)");
        check = leer.nextBoolean();
        
        System.out.println("Ingresar un numero decimal Double (con coma)");
        n = leer.nextDouble();
        
        System.out.println("Ingresar una letra");
        letra1 = leer.next().charAt(0);
        
        System.out.println("Se indicó que es: " +check);
        System.out.println("El numero double ingresado es: " +n);
        System.out.println("El caracter ingresado es: "+letra1);
                
        *--------------------------------------------------------------*
        Ejercicio 6
        
        int num1 = 10;
        int num2 = 5;
         
        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos numeros son mayores a 25");
        } else if (num1> 25){
           System.out.println("Solo el primer numero es mayor a 25");
        } else if (num2 > 25) {
            System.out.println("Solo el segundo numero es mayor a 25");
        } else if (num1 < 25 && num2 < 25) {
            System.out.println("Ninguno de los numeros es mayor a 25");
        }
        *--------------------------------------------------------------*
        Ejercicio 7

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor entre 1 y 4");
        int tipoMotor = leer.nextInt();
        
        switch (tipoMotor) {
            case 1: 
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2: 
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3: 
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4: 
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor valido para tipo de bomba");
        }
        *--------------------------------------------------------------*
        Ejercicio 8  
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nota");
        int nota = leer.nextInt();
        
        while (nota<0 || nota >10) {
            System.out.println("Ingreso una nota incorrecta. Vuelva a intentarlo.");
            nota = leer.nextInt();
        }
         if (nota <= 10 && nota >= 0) {
            System.out.println("Su nota es: " + nota);
        } 
        
        *--------------------------------------------------------------*
        Ejercicio 9

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 20 numeros");
        int cont = 0;
        int suma = 0;
        int num;        
        
        Opcion original
        do {
           num = leer.nextInt();
           cont = cont + 1;
           if (cont<=20) {
             suma = suma + num;   
           }  
                 
        } while (num != 0 && cont < 20); 
        
        opcion que sigue la consigna
        do {
           num = leer.nextInt();
           cont = cont + 1;
           if (num == 0 ){
               break;
           } else if (num > 0) {
                suma = suma + num;
           }               
               
        } while (cont < 20);
        System.out.println("La suma de los numeros ingresados es: " + suma);
        *--------------------------------------------------------------*
        Ejercicio 10
 
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        
        for (int i = 0; i < 4; i++) {
            int num = leer.nextInt();
            
            if (num>=1 && num<=20){
                System.out.print(num);
                for (int j = 0; j < num; j++) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        
        *--------------------------------------------------------------*
        Ejercicio 11 
        
        
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
        
    *--------------------------------------------------------------*
    Ejercicio 12 
   
      Scanner leer = new Scanner(System.in);
      System.out.println("Este programa valida si el primer numero ingresado ES MULTIPLO del segundo valor ingresado");
      System.out.println("Ingrese el numero que quiere validar");
      int num1 = leer.nextInt();
      System.out.println("Ingrese el segundo numero");
      int num2 = leer.nextInt();
      
      EsMultiplo(num1,num2);
    } 
    
    public static void EsMultiplo(int num1, int num2){
        if (num1 % num2 == 0){
            System.out.println(num1 + " es múltiplo de " + num2);
        } else {
            System.out.println(num1 + " es NO múltiplo de " + num2);
        }
    }  
    *--------------------------------------------------------------*
    Ejercicio 13 y 14    
      
        Scanner leer = new Scanner(System.in); 
        String[] equipo = new String[4];
        
        System.out.println("Ingrese el nombre de sus compañeros de equipo:");
        for (int i = 0; i < equipo.length; i++) {
            equipo[i] = leer.nextLine();
            System.out.println("El " + (i+1) + "° miembro de su equipo es: " + equipo[i]);
        }
    */   
        
    }
}