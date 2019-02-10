package polymorphism;

public class Teacher extends Person{
    String course = "Java";
    
    @Override
    void display(){
        super.display();
        System.out.println("Course: "+course);
    }
}
