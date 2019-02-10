package BasicJava;
import java.util.Scanner;
public class Loop1Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n;
        int sum =0;
        
        System.out.print("Enter your initialized nummber: ");
        m = input.nextInt();
        System.out.print("Enter your final nummber: ");
        n = input.nextInt();
        
        for (int i = m; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Totall= "+sum);
    }
}
