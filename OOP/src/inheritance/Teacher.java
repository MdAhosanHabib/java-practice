package inheritance;

public class Teacher extends Person {
    String qualification;
    
    void dispaly2(){
        display1();
        System.out.println(qualification);
    }
}
