package abstraction;

public class PrblmTest {
    public static void main(String[]args){
        PrblmShape ps;
        
        ps = new PrblmRectangle(10,20);
        ps.area();
        
        ps = new PrblmTriangle(10,20);
        ps.area();
        
        ps = new PrblmCircle(10);
        ps.area();
    }
}
