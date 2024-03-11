package co.edu.sena;

import java.util.Scanner;

//5...
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
            double cocientee = (double) A / B;
            System.out.println("El cociente entre A y B es: " + cocientee);
        } else {
            System.out.println("La división por cero no se ha definido, la división no es posible.");
        }

        scanner.close();
    }
}
