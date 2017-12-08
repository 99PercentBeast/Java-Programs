//importing Scanner class from java.util package
//Scanner helps to take input from user;
import java.util.Scanner;
public class SimpleTable {
    public static void main(String args[]){
        //Scanner class's object -> scan is created;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        //int for easier implementation;
        int number = scan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(number+" times "+i+" is "+(number*i));
        }
    }
}
