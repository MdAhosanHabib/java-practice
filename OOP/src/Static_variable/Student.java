package Static_variable;

public class Student {
    static int count = 0;
    
    Student(){
        count++;
    }
    
    void display(){
        System.out.println("Student Number: "+count);
    }
}
