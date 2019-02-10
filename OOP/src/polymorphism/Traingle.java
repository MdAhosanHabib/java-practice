package polymorphism;

public class Traingle extends Shape{
    double hight, weight;
    
    Traingle(double hight, double weight){
        this.hight = hight;
        this.weight = weight;
    }
    
    @Override
    double area(){
        System.out.print("Traingle: ");
        return .5*hight*weight;
    }
}
