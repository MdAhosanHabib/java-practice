package oop;

public class Teacher {
    String name,gender;
    int phone;
    void setinformation(String n, String m, int nm){
        name = n;
        gender = m;
        phone = nm;
    }
    void displayInformation(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone: "+phone);
        System.out.println("\n");
    }
}
