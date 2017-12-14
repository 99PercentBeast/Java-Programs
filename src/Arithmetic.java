import java.util.Scanner;

public class Arithmetic {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        boolean flag=true;
        while (flag) {
            System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
            System.out.println("Enter your choice : ");
            int choice = scan.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Addition : "+addition()+"\n");
                    break;
                case 2:
                    System.out.println("Subtraction : "+subtraction()+"\n");
                    break;
                case 3:
                    System.out.println("Multiplication : "+multiplication()+"\n");
                    break;
                case 4:
                    System.out.println("Division : "+division()+"\n");
                    break;
                case 5:
                    System.out.println("\n============Exiting the program=============\n");
                    flag = false;
            }
        }
    }

    private static int addition(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number1=scan.nextInt();
        System.out.print("Enter a number : ");
        int number2=scan.nextInt();
        return (number1+number2);
    }
    private static int multiplication(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number1=scan.nextInt();
        System.out.print("Enter a number : ");
        int number2=scan.nextInt();
        return (number1*number2);
    }
    private static double division(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        double number1=scan.nextDouble();
        System.out.print("Enter a number : ");
        double number2=scan.nextDouble();
        return (number1/number2);

    }
    private static int subtraction(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number1=scan.nextInt();
        System.out.print("Enter a number : ");
        int number2=scan.nextInt();
        return (number1-number2);
    }
}

