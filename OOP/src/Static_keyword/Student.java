package Static_keyword;

public class Student {
    String name;
    int id;
    static String university = "Daffodil international university";
    
    Student(String n, int i){
        name = n;
        id =  i;
    }
    
    void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("University name: "+university);
        System.out.println("");
    }
}
