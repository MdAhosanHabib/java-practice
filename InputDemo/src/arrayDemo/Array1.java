package arrayDemo;

public class Array1 {
    public static void main(String[]args){
        int[] number = new int[5];
        
        number[0]=2;
        number[1]=3;
        number[2]=4;
        number[3]=5;
        number[4]=6;
        
        int len = number.length;
        System.out.println(len);
        System.out.println(number[2]);
    }
}
