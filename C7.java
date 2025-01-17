import java.util.Scanner;
public class C7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a : ");
		int a = sc.nextInt();
		System.out.print("Enter b : ");
		int b = sc.nextInt();

		b = a+b;
		a = b-a;
		b = b-a;

		//si=(p*i*t)/100
		System.out.println("a = " + a + ", b = " + b);
	}
}