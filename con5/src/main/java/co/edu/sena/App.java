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
        System.out.print("Ingrese el valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Ingrese el valor de B: ");
        int B = scanner.nextInt();

        if (B != 0) {
            double cociente = (double) A / B;
            System.out.println("El cociente entre A y B es: " + cociente);
        } else {
            System.out.println("La división por cero no está definida, la división no es posible.");
        }

        scanner.close();
    }
}