package stringpackage;
import java.util.Scanner;
public class NumberConversation2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int decimal;
        System.out.print("Enter a Decimal Numver: ");
        decimal = input.nextInt();
        String binary = Integer.toHexString(decimal);
        System.out.println("Binary = "+binary);
    }
}
