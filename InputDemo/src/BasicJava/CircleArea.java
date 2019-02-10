package BasicJava;
import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double radius,area;
        System.out.print("Enter Radius: ");
        radius = input.nextDouble();
        
        area = 3.1416*radius;
        System.out.println("Circle Area: "+area);
    }
}