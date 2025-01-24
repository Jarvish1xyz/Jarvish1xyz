import java.util.Scanner;

public class A1 {

	public static float area(int r) {
		float ar = 3.14f * r * r;
		return ar;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Radius: ");
		int r = sc.nextInt();

		float ans = area(r);

		System.out.println("Area = " + ans);
	}
}