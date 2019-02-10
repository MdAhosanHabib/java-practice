package BasicJava;
import java.util.Scanner;
public class VowelConsonent {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        char cr;
        System.out.print("Enter a letter: ");
        cr = input.next().charAt(0);
        
     /*   if(cr == 'a'){
            System.out.println("vowel");
        }
        else if(cr == 'e'){
            System.out.println("vowel");
        }
        else if(cr == 'i'){
            System.out.println("vowel");
        }
        else if(cr == 'o'){
            System.out.println("vowel");
        }
        else if(cr == 'u'){
            System.out.println("vowel");
        }
        else{
            System.out.println("Consonent");
        }   */
     
     if(cr=='a' || cr=='e' || cr=='i' || cr=='o' || cr=='u' || cr=='A' || cr=='E' || cr=='I' || cr=='O' || cr=='U'){
         System.out.println("vowel");
     }
     else{
         System.out.println("Consonent");
     }
    }
}
