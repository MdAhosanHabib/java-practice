package BasicJava;
import java.util.Scanner;
public class MultySeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, mul=1;
        
        System.out.print("Enter last number: ");
        n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print(i+"X"+i+" ");
            mul = mul*(i*i);
        }
        System.out.println("");
        System.out.println("Multiplication of those numbers: "+mul);
    }
}
