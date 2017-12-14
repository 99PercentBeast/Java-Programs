import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to find factorial of : ");
        int number = scan.nextInt();
        int fact = factorial(number);
        System.out.print("Factorial of number is : "+fact);
        scan.close();
    }

    private static int factorial(int number){
        /*
        public static void factorial(int number){
        int fact=1;
        for (int i=1;i<number;i++){

        fact = fact * i;

        }
        return fact;

        }
         */


        if(number==0)
            return 1;
        else
            return (number*factorial(number-1));
    }
}
