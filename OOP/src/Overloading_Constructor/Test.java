package Overloading_Constructor;

public class Test {
    public static void main(String[] args) {
  
    Teacher teacher1 = new Teacher();
    Teacher teacher2 = new Teacher("Ahosan","Male");
    teacher2.display();
    Teacher teacher3 = new Teacher("Rakib","Male",12345);
    teacher3.display();
    }
}
