package file;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FileDemo2 {

    public static void main(String[] args) {
        String id, name;
        Scanner input = new Scanner(System.in);

        try {

            Formatter formatter = new Formatter("F:/codes/java/OOP/Person/student.txt");
            System.out.print("How many number you want to input:");
            int num = input.nextInt();
            for (int i = 1; i <= num; i++) {
                System.out.print("Enter id and name:");
                id = input.next();
                name = input.next();
                formatter.format("%s %s\r\n", id, name);
            }
            formatter.close();

            /*  formatter.format("%s %s\r\n", "974","Ahosan");
        formatter.format("%s %s\r\n", "976","Habib");
        formatter.format("%s %s\r\n", "973","Munna");
        formatter.close();  */
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
