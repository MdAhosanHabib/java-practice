package OOP2;

public class Teacher2 {
    String name,gender;
    int phone;
    Teacher2(){
        System.out.println("it is Null");
    }
    Teacher2(String n, String m, int ph){  //constructor
        name = n;
        gender = m;
        phone = ph;
    }
    void displayinformation(){
        System.out.println(name);
        System.out.println(gender);
        System.out.println(phone);
        System.out.println("");
    }
}
