package BasicJava;

public class BreakContinue {
    public static void main(String[]args){
        int i;
        for(i=1;i<=100;i++){
            if(i==10){
                //break;
                continue;
            }
            if(i>13){
                break;
            }
            System.out.println(i+"Rakib");
        }
    }
}
