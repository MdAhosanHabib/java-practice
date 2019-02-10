package oop;

public class CallByValueTest {
    public static void main(String[]args){
        CallByvalue o1 = new CallByvalue();
        int x = 10;
        System.out.println("X = "+x);
        
        o1.change(x);
        System.out.println("X = "+x);
    }
}
