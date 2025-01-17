import java.util.Scanner;

public class A5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number: ");

		int n = sc.nextInt();
		int t = 0;

		for(int i=2; i<n; i++) {
			if(n%i==0) {
				t++;
			}
		}

		if(t==0) {
			System.out.println("Number is prime.");
		}
		else {
			System.out.println("Number is not prime.");
		}
	}
}