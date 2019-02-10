package static_method;

public class StaticMethod {
    void display1(){
        display2(); // static method not able to access non-static method
        System.out.println("I am non static method");
    }
    static void display2(){
       // display1();
        System.out.println("I am static method");
    }
}
