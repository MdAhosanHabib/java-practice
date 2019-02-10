package file;

import java.io.File;
import java.util.Scanner;

public class FileDemo3 {
    public static void main(String[] args) {
        try{
        File file = new File("F:/codes/java/OOP/Person/student.txt");
        Scanner scan = new Scanner(file);
        while(scan.hasNext()){
            String id = scan.next();
            String name = scan.next();
            System.out.println("ID: "+id+" Name: "+name);
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
