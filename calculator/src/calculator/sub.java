package calculator;
import java.util.Scanner;
public class sub {
   
   public void substrac(){
	   Scanner scan = new Scanner(System.in);
	   System.out.print("Enter the first number: ");
	   double firstnum = scan.nextDouble();
	   System.out.print("Enter the second number:");
	   double secondnum = scan.nextDouble();
	   double ans = firstnum-secondnum;
	   System.out.println("substraction answer is: "+ans);
	   
	   
   }
}
