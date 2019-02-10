package list;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[]args){
        HashSet<String> fname = new HashSet<String>();
        
        fname.add("Banana");
        fname.add("Apple");
        fname.add("Mango");
        fname.add("Pinapple");
        
        for(String f: fname){
            System.out.println(f);
        }
        
        System.out.println("Size: "+fname.size());
        
        fname.remove("Apple");
        for(String f: fname){
            System.out.println(f);
        }
        
        fname.clear();
        for(String f: fname){
            System.out.println(f);
        }
        
        boolean x = fname.isEmpty();
        System.out.println("Fruit name clear: "+x);
    }
}
