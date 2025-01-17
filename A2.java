import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter n: ");
		int n = sc.nextInt();
		float avg = 0;

		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("Enter element-"+(i+1)+": ");
			arr[i] = sc.nextInt();
			avg+=arr[i];
		}

		avg = avg/n;

		System.out.println("avg = " + avg);
	}
}