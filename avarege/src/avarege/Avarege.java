package avarege;
import java.util.Scanner;
public class Avarege {

    
    public static void main(String[] args) {
        
    Scanner a = new Scanner (System.in);
    int x;
    int y;
    float avg;
    System.out.println("input your first number: ");
    x=a.nextInt();
    System.out.println("input your second number: ");
    y=a.nextInt();
    avg = (x+y)/2;
    System.out.println("avarege is: "+avg);
}
}