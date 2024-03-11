package co.edu.sena;

import java.util.Scanner;

//7...
public class App 

            {
            static Scanner scanner = new Scanner(System.in);
    public static void main( String[] args )
    {
        System.out.print("Ingrese un año: ");
        int ano = scanner.nextInt();

        boolean Bisiesto = (ano % 4 == 0 && ano % 100 != 0) || (ano% 400 == 0);

        if (Bisiesto) {
            System.out.println(ano + " es un año bisiesto.");
        } else {
            System.out.println(ano + " no es un año bisiesto.");
        }

        scanner.close();
    }
}
