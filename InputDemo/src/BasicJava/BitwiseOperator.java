package BasicJava;
import java.util.Scanner;
public class BitwiseOperator {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int result;
        System.out.print("Enter your first number: ");
        a = input.nextInt();
        System.out.print("Enter your Second Number: ");
        b = input.nextInt();
        
        result = a&b;
        System.out.println("AND: "+result);
        
        result = a|b;
        System.out.println("OR: "+result);
        
        result = a^b;
        System.out.println("XOR: "+result);
    }
}
