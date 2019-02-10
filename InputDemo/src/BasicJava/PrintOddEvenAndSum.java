package BasicJava;
import java.util.Scanner;
public class PrintOddEvenAndSum {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int m ,n;
        int sum = 0;
        
        System.out.print("Enter initialized number: ");
        m = input.nextInt();
        System.out.print("Enter final number: ");
        n = input.nextInt();
        
        for (int i = m; i <= n; i++) {
            
            if(i%2==0){
            System.out.print(" "+i);
            sum = sum+i;
            }
        }
        System.out.println("");
        System.out.println("Sum of even number: "+sum);
    }
}
