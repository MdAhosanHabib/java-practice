package BasicJava;
import java.util.Scanner;
public class ConditionalDemo {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num1, num2, large;
        System.out.print("Enter your first number: ");
        num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        num2 = input.nextInt();
        
        large = (num1>num2)? num1:num2;
        System.out.println("The large number is: "+large);
    }
}
