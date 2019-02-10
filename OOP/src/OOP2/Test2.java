package OOP2;

public class Test2 {
    public static void main(String[]args){
        Teacher2 teacher21 = new Teacher2("Ahosan habib","Male",1324);
        teacher21.displayinformation();    //constructor
        
        Teacher2 teacher22 = new Teacher2("Ahosan Rakib","Male",4321);
        teacher22.displayinformation(); 
        
        Teacher2 teacher23 = new Teacher2();
        teacher23.displayinformation();
    }
}
