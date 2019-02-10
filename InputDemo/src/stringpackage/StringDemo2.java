package stringpackage;

public class StringDemo2 {
    public static void main(String[]args){
        String firstname = "Ahosna";
        String lastname = " Habib";
        
        String fullname = firstname.concat(lastname);
        System.out.println(fullname);
        
        String uppername = fullname.toUpperCase();
        System.out.println(uppername);
        
        String lowername = fullname.toLowerCase();
        System.out.println(lowername);
        
        boolean b = fullname.startsWith("A");
        System.out.println(b);
        
        boolean c = fullname.endsWith("a");
        System.out.println(c);
        
        String[] name = {"rakib","sakib","sourov","lemon"};
    /*    for(int i=0;i<4;i++){
            System.out.print(name[i]+" ");
        }  */
    
        for(String x: name){
            System.out.print(x+" ");
        }
    }
}
