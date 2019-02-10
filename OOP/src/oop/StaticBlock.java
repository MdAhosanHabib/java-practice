package oop;

public class StaticBlock {
    static int a;
    static String s ;
    
    static{
        a = 121;
        s = "Ahosan";
    }
    
    static void diaplay(){
        System.out.println("ID: "+a);
        System.out.println("Name: "+s);
    }
}
