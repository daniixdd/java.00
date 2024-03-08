package co.edu.sena;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 

            {
            static Scanner scanner = new Scanner(System.in);
    public static void main( String[] args )
    {
        System.out.print("Ingrese un año: ");
        int year = scanner.nextInt();

        boolean esBisiesto = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (esBisiesto) {
            System.out.println(year + " es un año bisiesto.");
        } else {
            System.out.println(year + " no es un año bisiesto.");
        }

        scanner.close();
    }
}
