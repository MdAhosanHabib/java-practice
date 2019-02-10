package stringpackage;

public class StringDemo1 {
    public static void main(String[]args){
        String s1 = "Ahosan Habib";
        String s2 = new String("Ahosan Habib");
        
        System.out.println(s1);
        System.out.println(s2);
        
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
        
        int len = s1.length();
        System.out.println("s1 length: "+len);
        
        boolean con = s1.contains("Ahosan");
        System.out.println(con);
        
        boolean emp = s1.isEmpty();
        System.out.println("s1 is empty: "+emp);
    }
}
