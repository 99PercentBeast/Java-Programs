//Fibonacci using recursion
import java.util.Scanner;
public class FibonacciRecursion {
    private static int fibo(int number){
        if (number<=1) {
            return (number);
        }
        else {
            return((fibo(number-1))+fibo(number-2));
        }
    }


    public static void main(String args[]){
        System.out.print("Enter a number for fibonacci :");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.print(fibo(number));
    }
}
