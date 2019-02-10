package arrayDemo;
import java.util.Scanner;
public class FindingMaxMinByArray {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double[] number = new double[5];
        double sum = 0;
        System.out.print("Please Enter 5 number: ");
        for(int i=0;i<number.length;i++){
            number[i] = input.nextDouble();
        }
        for(int i=0;i<number.length;i++){
            sum = sum+number[i];
        }
        double avrg = sum/number.length;
        System.out.println("Sum is: "+sum);
        System.out.println("Average is: "+avrg);
        
        double max = number[0];
        double min = number[0];
        
        for(int i=1;i<5;i++){
            if(max<number[i]){
                max = number[i];
            }
            if(min>number[i]){
                min = number[i];
            }
        }
        System.out.println("maximum number: "+max);
        System.out.println("minimum number: "+min);
    }
}
