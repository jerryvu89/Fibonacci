/*
Create Java program to calculate and print Fibonacci number using both recursion
and Iteration.
Fibonacci number is the sum of previous two Fibonacci numbers 
fn = fn - 1 + fn - 2
The first 10 Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
 */

package fibonacci;
import java.util.Scanner;

/**
 * @author Jerry Vu
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Input to print Fibonacci series up to how many numbers
        System.out.println("Enter number up to which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();
        
        System.out.println("Fibonacci series up to " + number + " numbers: ");
        // Printing Fibonacci series up to number
        for (int i = 1; i <= number; i++){
            System.out.print(fibonacci2(i) + " ");
        }
    }
    
    /*
    Java program for Fibonacci number using recursion.
    This program uses tail recursion to calculate Fibonacci number for a given number
    at return Fibonacci number
    */
    
    public static int fibonacci(int number){
        if (number == 1 || number == 2){
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2); // tail recursion
    }
    
    /*
    Java Program to calculate Fibonacci number using loop or Iteration.
    at return Fibonacci number
    */
    
    public static int fibonacci2(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        int fibo1 = 1, fibo2 = 1, fibonacci = 1;
        for(int i = 3; i <= number; i++){
            
            // Fibonacci number is sum of previus two Fibonacci number
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        return fibonacci; // Fibonacci number
    }
    
}
