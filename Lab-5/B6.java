import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter n: ");
		int n = sc.nextInt();

		for(int i=1; i<=n; i++) {
			for(int k=n; k>i; k--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<n; i++) {
			for(int k=1; k<=i; k++) {
				System.out.print(" ");
			}
			for(int j=n-1; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}