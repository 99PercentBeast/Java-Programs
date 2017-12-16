import java.util.Scanner;
public class PrimeNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        boolean flag = false;
        System.out.print("Enter a number : ");
        int number = scan.nextInt();
        int temp = number/2; //To break down Big numbers and have less time complexity
        for(int i=2;i<=temp;i++){
            if(number%i==0){
                flag = true;
                break;
            }
        }
        if(flag) System.out.print(number+" is not a Prime Number!");
        else System.out.print(number+" is a Prime Number!");

        scan.close();
    }
}
