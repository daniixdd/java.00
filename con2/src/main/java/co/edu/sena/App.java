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

        if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor que el número " + num2 + "");
        } else if (num1 < num2) {
            System.out.println("El número " + num2 + " es mayor que el número " + num1 + "");
        } else {
            System.out.println("Ambos números son iguales " + num1 + "");
        }

        scanner.close();
    }
}