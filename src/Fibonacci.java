import java.util.Scanner;
import java.math.BigInteger;
/*

Big integer helps us to find Fibonacci of Bigger Number such as 100;

function such as .add are use instead of '+';

 */
public class Fibonacci {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scan.nextInt();
        BigInteger a=BigInteger.valueOf(0);
        BigInteger b=BigInteger.valueOf(1);
        BigInteger c=BigInteger.valueOf(0);
        for(int i=1;i<number;i++){
            System.out.println(c);
            c = a.add(b);
            a=b;
            b=c;
        }
        scan.close();
    }
}
