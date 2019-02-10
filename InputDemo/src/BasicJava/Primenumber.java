package BasicJava;
import java.util.Scanner;
public class Primenumber {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num;
        int count = 0;
        System.out.print("Enter your checking number: ");
        num = input.nextInt();
        
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
