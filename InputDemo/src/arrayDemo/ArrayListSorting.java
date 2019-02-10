package arrayDemo;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListSorting {
    public static void main(String[]args){
        ArrayList<Integer> number = new ArrayList<>();
        
        number.add(2);
        number.add(1);
        number.add(8);
        number.add(3);
        number.add(-3);
        number.add(0);
        number.add(23);
        
        System.out.println("Array is: "+number);
        
        Collections.sort(number);
        System.out.println("After sorting ascending: "+number);
        
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("After sorting descending: "+number);
    }
}
