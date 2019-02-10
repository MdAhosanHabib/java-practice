package app11;
import java.util.Scanner;
public class app11 {

	public static void main(String[] args) {
		Scanner bucky = new Scanner (System.in);
		double fnum, snum, answer;
		System.out.println("Enter The First num: ");
		fnum = bucky.nextDouble();
		System.out.println("Enter The Second num:  ");
		snum = bucky.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);

	}

}
