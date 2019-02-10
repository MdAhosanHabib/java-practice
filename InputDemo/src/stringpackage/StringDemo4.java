package stringpackage;

public class StringDemo4 {
    public static void main(String[] args) {
        String s1 = "this_is_my country";
        
        String s2 = s1.replace("i", "j");
        System.out.println("after replace: "+s2);
        
        String[] s3 = s1.split("_");
        for(String x: s3){
            System.out.println(x);
        }
    }
}
