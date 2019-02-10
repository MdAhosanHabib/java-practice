package app43;
import java.util.Scanner;
public class App43 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String tuna;
		tuna tunaObject = new tuna ();
		
		System.out.println("Enter your name here: ");
 String name = input.nextLine();
 
 tunaObject.simpleMessage(name);
	}

}
