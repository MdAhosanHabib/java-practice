package list;

import java.util.LinkedList;

public class LinkListDemo {
    public static void main(String[] args) {
        LinkedList<String> countrylist = new LinkedList<String>();
        
        countrylist.add("Bangladesh");
        countrylist.add("afgan");
        countrylist.add("india");
        countrylist.addFirst("Australia");
        countrylist.addLast("japan");
        //countrylist.remove("india");
        //countrylist.remove(3);
        countrylist.removeFirst();
        countrylist.removeLast();
        
        for(String x: countrylist){
            System.out.println(x);
        }
        
        System.out.println("First country name: "+countrylist.getFirst());
        System.out.println("Last country name: "+countrylist.getLast());
        System.out.println("Size o flinklist: "+countrylist.size());
        
        countrylist.clear();
        System.out.println(countrylist);
        
    }
}
