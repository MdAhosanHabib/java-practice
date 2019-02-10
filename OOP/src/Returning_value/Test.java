package Returning_value;

public class Test {
    public static void main(String[]args){
        ReturningValueDemo ob1 = new ReturningValueDemo();
        int result = ob1.square(5);
        System.out.println("Square of 5 = "+result);
        
        ReturningValueDemo ob2 = new ReturningValueDemo();
        int res = ob2.square(6);
        System.out.println("Square of 5 = "+res);
    }
}
