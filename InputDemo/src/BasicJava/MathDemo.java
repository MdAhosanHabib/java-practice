package BasicJava;
import java.util.Scanner;
public class MathDemo {
    public static void main(String[]args){
        
        
        int x = 2;
        int y = 3;
        
        int mx = Math.max(x,y);
        System.out.println(mx);
        
        int mn = Math.min(x,y);
        System.out.println(mn);
        
        int ab = Math.abs(y);
        System.out.println(ab);
        
        double pw = Math.pow(x,y);
        System.out.println(pw);
        
        int round = Math.round(8.8f);
        System.out.println("The round value: "+round);
    }
}
