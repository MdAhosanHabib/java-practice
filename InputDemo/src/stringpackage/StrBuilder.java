package stringpackage;

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Ahosan");
        System.out.println("Str = "+str);
        
        str.append(" Habib ");
        str.append(123);
        str.append(123.4);
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.delete(0, 5);
        System.out.println(str);
        
    }
}
