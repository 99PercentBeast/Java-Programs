import java.util.Scanner;
public class Armstrong {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scan.nextInt();
        boolean result=false;
        //Armstrong Method
        armstrongOrNot(number);
    }
    private static void armstrongOrNot(int number){
        int temp=number;
        int length=(int)(Math.log10(number)+1);//log10(100)=2 log10(1000)=3 .'. log10(100)+1=3
        int remainder;
        int sum=0;
        while(number > 0){
            remainder = number%10;
            sum+=Math.pow(remainder,length);//remainder^length
            number /=10;
        }
        if (sum == temp) System.out.print(temp+" is a Armstrong Number!");
        else System.out.print(temp+" is not a Armstrong Number");
    }
}
