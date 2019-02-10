package arrayDemo;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
 
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(4,50);
        
        for(int x: number){
            System.out.print(x+" ");
        } 
        System.out.println("");
       System.out.println("size: "+number.size());
       
       number.remove(2);
       System.out.print("after removing: "+number);
       
       System.out.println("");
       
       number.removeAll(number);
       System.out.print("after all remove: "+number);
     
        /*  Iterator itr = number.iterator();
       while(itr.hasNext()){
           System.out.print(itr.next()+" ");
       }  */
       
        System.out.println("");
        System.out.println("size: "+number.size());
    }
}
