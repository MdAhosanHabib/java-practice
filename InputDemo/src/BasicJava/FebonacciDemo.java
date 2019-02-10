package BasicJava;
import java.util.Scanner;
public class FebonacciDemo {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number for febonacci: ");
        int n = input.nextInt();
        
        int first = 0;
        int second = 1;
        int febo;
        System.out.print(first+" "+second);
        for (int i = 3; i <= n; i++) {
            febo = first+second;
            System.out.print(" "+febo);
            first = second;
            second = febo;
        }
        System.out.println("");
        
    }
}
