package abstraction;

public class PrblmCircle extends PrblmShape{
    
    PrblmCircle(double r){
        super(r,r);
    }
    
    @Override
    void area(){
        double result = Math.PI * dim1 * dim2;
        System.out.printf("Circle: %.2f\n",result);
    }
}
