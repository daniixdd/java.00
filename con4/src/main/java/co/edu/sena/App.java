package co.edu.sena;
import java.util.Scanner;

//.
public class App
{
    public static void main( String[] args )
        {
            Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el valor que equivale A: ");
        int A = scanner.nextInt();

        System.out.print("Ingrese el valor que equivale B: ");
        int B = scanner.nextInt();

        int resul = (A < B) ? A + B : A - B;

        System.out.println("El resultado es: " + resul);

        scanner.close();
    }
}