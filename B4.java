import java.util.Scanner;

public class B4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String: ");
		String str = sc.nextLine();
		int n = str.length();

		System.out.println("Length of String = " + n);

		for(int i=n/2; i<n; i++) {
			System.out.print(str.charAt(i));
		}
	}
}