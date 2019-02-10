package polymorphism;

public class Rectangle extends Shape{
    Double hight,weight;
    
    Rectangle(double hight, double weight){
        this.hight = hight;
        this.weight = weight;
    }
    
    @Override
    double area(){
        System.out.print("Rectangle: ");
        return hight*weight;
    }
}
