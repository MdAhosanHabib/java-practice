package arrayDemo;
public class OutPutArray6 {
    public static void main(String[]args){
        int[][] number = new int[4][5];
        int k = 0;
        
        //input step
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                number[i][j] = k;
                k++;
            }
        }
        
        //print step
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print(" "+number[i][j]);
            }
            System.out.println("");
        }
    }
}
