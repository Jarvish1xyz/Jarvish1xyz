import java.util.Scanner;

public class B6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();

		if((year%4==0)&&(year%100!=0) || year%400==0) {
			System.out.println("Year is Leap year.");
		}
		else {
			System.out.println("Year is not a leap year.");
		}
	}
}