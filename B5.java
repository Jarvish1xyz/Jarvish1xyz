import java.util.Scanner;

public class B5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter length in meter : ");
		double m = sc.nextDouble();
		double f = m*3.28084;

		System.out.println("ans = " + f);
	}
}