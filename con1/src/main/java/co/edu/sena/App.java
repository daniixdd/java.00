package co.edu.sena;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    
//Escribir un algoritmo para saber si el número ingresado por teclado es positivo o negativo.public class App 
     {
          Scanner escaner = new Scanner(System.in);
           // Mandar mensaje
            System.out.println("Escribe un número:");
             // Leer lo que se introduce        
             double numero = escaner.nextDouble();
              // Comparar       
               if (numero == 0) {
                 System.out.println("El número es Cero");
                 } else if (numero < 0) {
                     System.out.println("El número es negativo");
                     
 }
  else {
     System.out.println("El número es positivo");
     }
    }
 }
    }

