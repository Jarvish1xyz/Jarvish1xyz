import java.util.Scanner;

public class C7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter length of array: ");
		int n = sc.nextInt();
		int nums[] = new int[n];

		for(int i=0; i<n; i++) {
			System.out.print("Enter Element of array : ");
			nums[i] = sc.nextInt();
		}

		System.out.print("Enter pivot index: ");
		int p = sc.nextInt();
		int pvt[] = new int[n];

		for(int i=0; i<n-p; i++) {
			pvt[i]=nums[i+p];
		}
		for(int i=n-p; i<n; i++) {
			pvt[i]=nums[i-(n-p)];
		}

		System.out.print("Enter target: ");
		int t = sc.nextInt();

		for(int i=0; i<n; i++) {
			if(pvt[i]==t) {
				System.out.println("index = " + i);
				break;
			}
		}
	}
}