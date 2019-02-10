package BasicJava;
import java.util.Scanner;
public class IfElse {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int num;
        System.out.print("Enter your Number: ");
        num = input.nextInt();
        
     /*   if(num>0){
            System.out.println("The number is positive");
        }
        else if(num<0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number equal to zero");
        }   */
     
        if(num%2 == 0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
     
    }
}
