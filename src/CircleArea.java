import java.util.*;
public class CircleArea {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        double radius = scan.nextDouble();
        System.out.print("Area of circle with radius "+radius+" = "+AreaOfCircle(radius));
        scan.close();
    }
    private static double AreaOfCircle(double radius){
        return Math.PI*radius*radius;
    }
}
