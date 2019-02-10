package BasicJava;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int r,num,temp,sum=0;
        System.out.print("Enter any number: ");
        num = input.nextInt();
        
        temp = num;
        
        while(temp!=0){
            r = temp%10;
            sum +=r;
            temp = temp/10;
        }
        System.out.println("Total sum: "+sum);
    }
}
