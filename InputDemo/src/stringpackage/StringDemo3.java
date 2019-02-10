package stringpackage;

public class StringDemo3 {
    public static  void main(String[]args){
        String country = "   Bangladesh is     my country   ";
        System.out.println(country);
        
        char c = country.charAt(0);
        System.out.println("Character at 0 index: "+c);
        
        int code = country.codePointAt(0);
        System.out.println("index 2 asci value: "+code);
        
        int pos = country.indexOf("is");
        System.out.println("Possition of is: "+pos);
        
        pos = country.lastIndexOf("n");
        System.out.println("last index of n: "+pos);
        
        String s3 = country.trim();
        System.out.println(s3);
    }
}
