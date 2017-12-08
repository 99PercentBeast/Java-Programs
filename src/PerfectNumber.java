import java.util.Scanner;
public class PerfectNumber {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        perfectOrNot(num);
    }
    private static void perfectOrNot(int num){
        int temp=0;
        for (int i=1;i<=num/2;i++){
            if(num%i==0){
                temp+=i;
            }
        }
        if(num==temp){
            System.out.print(num+" is a Perfect Number !");
        }
        else{
            System.out.print(num+" is a Not Perfect Number !");
        }
    }
}
