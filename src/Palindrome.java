import java.util.Scanner;
/*

Logic is kinda same as Armstrong but here we will check if Revered Number == Our Number Entered;

Eg.
1523251 == 1523251
 */
public class Palindrome {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scan.nextInt();
        int revers= reversed(number);
        if(revers == number){
            System.out.print("Entered number "+number+" is Palindrome !");

        }
        else System.out.print("Entered number "+number+" is not a Palindrome !");
        scan.close();
    }
    private static int reversed(int number){
        int temp = number;
        int rem;
        int rev=0;
        while (temp>0){
            rem = temp%10;
            rev = rev *10 + rem;
            temp/=10;
        }
        return rev;
    }
}
