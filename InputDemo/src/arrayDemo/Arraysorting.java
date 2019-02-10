package arrayDemo;

import java.util.Arrays;

public class Arraysorting {
    public static void main(String[]args){
        int[] number = {10,-3,56,21,7};
        Arrays.sort(number);
        
        System.out.print("Assending: ");
        for(int i=0;i<5;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println("");
        
        System.out.print("Dissending: ");
        for(int i=4;i>=0;i--){
            System.out.print(number[i]+" ");
        }
        
        System.out.println("");
        String[] name = {"rakib", "ahosan", "mim", "shahonaj"};
        Arrays.sort(name);
        System.out.print("String sort assending:");
        for(int i=0;i<4;i++){
            System.out.print(" "+name[i]);
        }
        
        System.out.println("");
        System.out.print("String sort dissending:");
        for(int i=3;i>=0;i--){
            System.out.print(" "+name[i]);
        }
    }
}
