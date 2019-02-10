package stringComparisom;

public class StringComparisom {
    public static void main(String[]args){
        
        String p1 = "ahosan123";
        String p2 = "ahosan123";
        String p3 = new String("ahosan123");
        String p4 = new String("ahosan123");
        
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1==p2);
        System.out.println(p1==p3);
        System.out.println(p1.equalsIgnoreCase(p4));
        
    }
}
