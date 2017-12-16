import java.util.Scanner;
/*

Pattern 3 :

    *
   ***
  *****
 *******
*********

 */


public class Pattern3 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : " );
        int num = scan.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=num-1;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
}
