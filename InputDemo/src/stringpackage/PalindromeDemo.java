package stringpackage;
import java.util.Scanner;
public class PalindromeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word to Check Palindrome Number: ");
        String s1 = input.next();
        StringBuffer sb = new StringBuffer(s1);
        
        String s2 = sb.reverse().toString();
        
        if(s1.equals(s2)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
