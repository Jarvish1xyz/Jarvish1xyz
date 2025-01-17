import java.util.Scanner;

public class SumOfTwo{
	public static void main(String[] args) {
		
		// int a =Integer.parseInt(args[0]);
		// int b =Integer.parseInt(args[1]);

		// System.out.println("Sum = " + (a+b));


		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a : ");
		int a = sc.nextInt();
		System.out.print("Enter b : ");
		int b = sc.nextInt();

		System.out.println("Sum = " + (a+b));
	}
}	