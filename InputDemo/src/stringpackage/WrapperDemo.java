package stringpackage;

public class WrapperDemo {
    public static void main(String[]args){
    /*    int x = 30;
       // primitive->object
        Integer y = x;
        System.out.println("x = "+y);
*/      
        // object->primitive
        Double a = new Double(10.23);
        System.out.println(a);
        
        double e = a;
        System.out.println(e);
    }
}
