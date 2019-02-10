package oop;

public class Test {
    public static void main(String[]args){
        Teacher teacher1 = new Teacher();
        teacher1.setinformation("Ahosan Habib","male",12345);
        teacher1.displayInformation();
        
        
        Teacher teacher2 = new Teacher();
        teacher2.setinformation("Ahosan Rakib", "male", 54321);
        teacher2.displayInformation();
    }
}
