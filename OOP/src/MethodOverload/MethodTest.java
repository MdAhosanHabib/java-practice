package MethodOverload;

public class MethodTest {
    public static void main(String[]args){
        Overload ov = new Overload();
        ov.add();
        ov.add(5, 6);
        ov.add(2, 4);
        ov.add(2, 4, 6);
    }
}
