package super_keyword;

public class Vehicle {
    String color;
    int gear;
    
    Vehicle(String c, int g){
        color = c;
        gear = g;
    }
    
    void display(){
        System.out.println("Color: "+color);
        System.out.println("Gear: "+gear);
    }
}
