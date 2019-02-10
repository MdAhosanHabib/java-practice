package exeption_handeling;

public class ExeptiionHandeling {
    public static void main(String[]args){
        try{
            int x = 10;
            int y = 0;
            int avg = x/y;
            System.out.println("AVG: "+avg);
        }catch(ArithmeticException e ){
            System.out.println("Exception: "+e);
        }
        finally{
            System.out.println("this is last line");
        }
    }
}
