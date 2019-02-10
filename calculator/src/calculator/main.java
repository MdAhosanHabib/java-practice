package calculator;
import java.util.Scanner;
public class main {
   static Scanner Sc = new Scanner(System.in);
   public static void main(String[] args){
	   add addition = new add();
	   sub substraction = new sub();
	   mul multiply = new mul();
	   div division = new div();
	   System.out.println("------------------Simple Calculator----------------");
	   do{
		   System.out.println("Select a option to use:");
		   System.out.printf("1.Addition\n2.Substraction\n3.Multiply\n4.Division\n");
		   double input=Sc.nextDouble();
		   if(input==1){
			   addition.addition();
		   } else if (input==2){
			  substraction.substrac();   
		   }else if (input==3){
			   multiply.multiply();
		   }else if(input==4){
			   division.division();
		   }
	   }while(true);
	   
   }
}
