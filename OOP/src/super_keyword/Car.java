package super_keyword;

public class Car extends Vehicle{
    String model;
    
    Car(String c, int g,String m){
        super(c,g);
        model = m;
    }
    
    @Override
    void display(){
        super.display();
        System.out.println("Model: "+model);
    }
}
