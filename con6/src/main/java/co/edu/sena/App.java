package co.edu.sena;

import java.util.Scanner;

//6...
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
    
            int result;
    
            if (A < 0 || B < 0) {
                result = A + B;
            } else {
                result = A * B;
            }
    
            System.out.println("El resultado es: " + result);
    
            scanner.close();
        }
    }}
