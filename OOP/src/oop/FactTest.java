package oop;

public class FactTest {
    public static void main(String[]args){
        FactorialDemo ob = new FactorialDemo();
        int result = ob.fact(5);
        System.out.println(result);
        
        int res = ob.fact(6);
        System.out.println(res);
    }
}