package polymorphism;

public class Student extends Person{
    double CGPA = 3.30;
    @Override
    void display(){
        super.display();
        System.out.println("CGPA: "+CGPA);
    }
}
