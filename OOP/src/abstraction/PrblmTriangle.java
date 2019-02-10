package abstraction;

public class PrblmTriangle extends PrblmShape{
    
    PrblmTriangle(double dim1, double dim2){
        super(dim1,dim2);
    }
    
    @Override
    void area(){
        double result = .5 * dim1 * dim2;
        System.out.println("Triangle: "+result);
    }
}
