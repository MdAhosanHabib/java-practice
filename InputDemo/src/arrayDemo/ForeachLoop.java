package arrayDemo;

public class ForeachLoop {
    public static void main(String[] args) {
     /*   String[] name = {"rakib","santo","shishir","mohon"};
        
        for(String x: name){
            System.out.println(x);
        }   */
     
     int[] num = {1,2,3,4,5,6,7,8,9,10};
     int sum=0;
     
     for(int x: num){
         sum +=x;
     }
        System.out.println(sum);
    }
}
