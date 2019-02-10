package BasicJava;
import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double frnht,result;
        System.out.print("Enter Fahrenheit: ");
        frnht = input.nextDouble();
        
        result = .5555556*(frnht-32);
        System.out.println("Celcius: "+result);
    }
}
