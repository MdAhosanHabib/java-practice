package BasicJava;
public class CodeTest {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                total +=i;
            }
        }
        System.out.println(total);
    }
}