package method_override_superkey;

public class B extends A{
    
    @Override
    void display(){
        super.display();
        System.out.println("inside B");
    }
}
