package BasicJava;
import java.util.Scanner;
public class AndOperator {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        char cr;
        System.out.print("Enter a letter: ");
        cr = input.next().charAt(0);
        
        if(cr>='a' && cr<='z'){
            System.out.println("Small Letter");
        }
        else if (cr>='A' && cr<='Z'){
            System.out.println("Capital Letter");
        }
        else{
            System.out.println("Not a letter");
        }
    }
}
