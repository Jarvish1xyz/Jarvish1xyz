import java.util.Scanner;

public class C9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of subject: ");
		int n = sc.nextInt();
		int sub[] = new int[n];
		System.out.print("Enter total mark of subject: ");
		int mark = sc.nextInt();
		int tmark=mark*n;
		float total=0.0;
		for(int i=0; i<n; i++) {
			System.out.print("Enter mark of subject-" + (i+1) +": ");
			sub[i] = sc.nextInt();
			total += sub[i];
		}
		total = (total/tmark)*100.0;

		if(total>=60) {
			System.out.println("First-Division");
		}
		else if(total>=50) {
			System.out.println("Second-Division");
		}
		else if(total>=40) {
			System.out.println("Third-Division");
		}
		else {
			System.out.println("Fail");
		}
		
	}
}