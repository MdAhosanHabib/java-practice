package method_overriding;

public class Test {
    public static void main(String[]args){
        Teacher t1 = new Teacher();
        t1.name = "Ahosan";
        t1.age = 22;
        t1.qualification = "BSC in CSE";
        t1.display();
        
        System.out.println("");
        
        Person p1 = new Person();
        p1.name = "Habib";
        p1.age = 21;
        p1.display();
    }
}
