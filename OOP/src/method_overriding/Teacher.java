package method_overriding;

public class Teacher extends Person{
    String qualification;
    
    @Override
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(qualification);
    }
}
