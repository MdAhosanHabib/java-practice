package randomtest;

import java.util.Random;

public class randomDemo {
    public static void main(String[]args){
        Random rand = new Random();
     //   int randomnumber = rand.nextInt(91)+10; // 10 to 100
          int randomnumber = (int) (Math.random()*10);
        System.out.println(randomnumber);
    }
}
