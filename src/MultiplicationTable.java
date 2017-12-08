import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number for Multiplication Table : ");
        double number = scan.nextDouble();
        System.out.print("Enter the number up to which you want Multiplication table : ");
        double multiplier = scan.nextDouble();
        for (int i=1; i<=multiplier;i++){
            double table=number*i;
            System.out.println(number+" times "+i+" is "+table);
        }
    }
}
