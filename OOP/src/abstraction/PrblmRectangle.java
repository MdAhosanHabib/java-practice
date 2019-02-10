package abstraction;

public class PrblmRectangle extends PrblmShape{
    
    PrblmRectangle(double dim1, double dim2){
        super(dim1,dim2);
    }
    
    @Override
    void area(){
        double result = dim1*dim2;
        System.out.println("Rectangle: "+result);
    }
}
