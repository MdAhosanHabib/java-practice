package BasicJava;
import java.util.Scanner;
public class palindromeDemo {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num,temp,r,sum=0;
        System.out.print("Enter a number to check palindrome: ");
        num = input.nextInt();
        
        temp = num;
        while(temp!=0){
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
        if(sum==num){
            System.out.println("It is a palindrome number");
        }
        else{
            System.out.println("It is not a palindrome number");
        }
    }
}
