import java.util.Scanner;

public class C8 {

	public static void sorted(int nums[]) {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter length of array: ");
		int n = sc.nextInt();
		int nums[] = new int[n];
		int m=0,l=0;

		for(int i=0; i<n; i++) {
			System.out.print("Enter array element: ");
			nums[i] = sc.nextInt();
		}

		for(int i=0; i<n; i++) {
			m=nums[0];
			for(int j=i; j<n; j++) {
				if(m<nums[j]) {
					l++;
				}
			}
			if(l>0) {
				sorted(nums);
			}
		}

		System.out.print("Enter pivot index: ");
		int p = sc.nextInt();
		int pvt[] = new int[n];
		int k=0;

		for(int i=p; i<n; i++) {
			pvt[k]=nums[i];
			k++;
		}
		for(int i=0; i<p; i++) {
			pvt[k]=nums[i];
			k++;
		}


	}
}