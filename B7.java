import java.util.Scanner;

public class B7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out,print("Enter num: ");
		int num = sc.nextInt();
		int revnum=0, a=num;
		while(a!=0) {
			revnum = (revnum*10)+(a%10);
			a/=10;
		}

		if(revnum==num) {
			System.out.println("Number is Palindrome.");
		}
		else {
			System.out.println("Number is not Palindrome.");
		}
	}
}