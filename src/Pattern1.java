import java.util.Scanner;
/*
Pattern 1 :

*
**
***
****
*****


 */

public class Pattern1 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scan.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        scan.close();
    }
}
