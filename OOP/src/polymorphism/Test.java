package polymorphism;

public class Test {
    public static void main(String[]args){
        Person p = new Person();
        p.display();
        
        System.out.println("");
        
        p = new Student();
        p.display();
        
        System.out.println("");
        
        p = new Teacher();
        p.display();
    }
}
