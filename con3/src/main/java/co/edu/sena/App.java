package co.edu.sena;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
            
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        int mayor = num1;
        int menor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }
        if (num2 < menor) {
            menor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }
        if (num3 < menor) {
            menor = num3;
        }

        System.out.println("El mayor número es: " + mayor);
        System.out.println("El menor número es: " + menor);

    }
}
    
