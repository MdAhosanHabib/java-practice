package stringpackage;

public class StringDemo5 {
        public static void main(String[] args) {
         
        String s1 = "Ahosan";
        StringBuffer sb = new StringBuffer(s1);
        
        sb.append(" Habib ");
        sb.append(25);
        System.out.println(sb);
        
        sb.reverse();
        System.out.println(sb);
        
        sb.delete(0, 5);
        System.out.println(sb);
        
        sb.setLength(5);
        System.out.println(sb);
    }
}
