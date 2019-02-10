package arrayDemo;

import java.util.Scanner;

public class ArraySumAvrg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double[] number = new double[5];
        System.out.print("Please Enter 5 number: ");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }

        /*   number[1] = input.nextDouble();
    number[2] = input.nextDouble();
    number[3] = input.nextDouble();
    number[4] = input.nextDouble();  */
        
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        
        //   double sum = number[0] + number[1] + number[2] + number[3] + number[4];

        double avrg = sum / number.length;
        System.out.println("Sum: " + sum);
        System.out.println("Sum Average: " + avrg);
    }
}
