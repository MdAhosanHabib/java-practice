package arrayDemo;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[]args){
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(4,50);
        
        System.out.println(number);
        
        boolean check = number.isEmpty();
        System.out.println("Array is Empty: "+check);
        
        boolean contain = number.contains(30);
        System.out.println("30 is contain: "+contain);
        
        int pos = number.indexOf(40);
        System.out.println("index number: "+pos);
        
        number.set(2, 60);
        System.out.println("after set: "+number);
        
        int x = number.get(3);
        System.out.println("index 3 value: "+x);
    }
}
