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
        {
            Scanner scanner = new Scanner(System.in);
      
            System.out.print("Ingrese el valor de A: ");
            int A = scanner.nextInt();
    
            System.out.print("Ingrese el valor de B: ");
            int B = scanner.nextInt();
    
            int resultado;
    
            if (A < 0 || B < 0) {
                resultado = A + B;
            } else {
                resultado = A * B;
            }
    
            System.out.println("El resultado es: " + resultado);
    
            scanner.close();
        }
    }}