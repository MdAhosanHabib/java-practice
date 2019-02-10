package oop;

public class CallbyreferenceTest {
    public static void main(String[] args) {
        
    Callbyreference ob1 = new Callbyreference();
    ob1.name = "Ahosan";
        System.out.println(ob1.name);
        
        ob1.change(ob1);
        System.out.println(ob1.name);
    }
}
