package list;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> connect = new HashMap<Integer,String>();
        
        connect.put(122, "Rakib");
        connect.put(123, "Sumon");
        connect.put(124, "Khayer");
        
        System.out.println(connect.get(122));
        System.out.println(connect.get(124));
    }
}
