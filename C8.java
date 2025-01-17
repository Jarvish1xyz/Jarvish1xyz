import java.util.Scanner;

public class C8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		int t=0;

		while(a!=b) {
			for(int i=2; i<a; i++) {
				if(a%i==0) {
					t++;
				}
			}
			if(t==0) {
				System.out.println(a);
			}
			a++;
			t=0;
		}

	}
}