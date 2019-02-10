package BasicJava;
import java.util.Scanner;
public class InputDemo {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
     /*   int number;
        System.out.print("Enter Your Number: ");
        number = input.nextInt();
        System.out.println("Your Number: "+number);  */
        
     /*   String name;
        System.out.print("Enter Your Name: ");
        name = input.nextLine();
        System.out.println("Your Name: "+name);   */
        
        Double num1;
        System.out.print("Enter Your Double Number: ");
        num1 = input.nextDouble();
        System.out.println("Your Double Number: "+num1);
    }
    
}
