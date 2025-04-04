/*
    Write a complete multi-threaded program to meet following requirements:
        a. Read matrix [A] m x n
        b. Create m number of threads
        c. Each thread computes summation of elements of one row, i.e. ith row of the matrix is processed by ith thread. Where 0 <= i< m.
        d. Print the results.
 */

package Lab.Lab_eleven;
import java.util.Scanner;


class summation extends Thread {
    int B[];

    summation(int B[]) {
        this.B = B;
    }
    public void run() {
        int sum = 0;
        for(int i=0; i<B.length; i++) {
            sum+=B[i];
        }
        System.out.println("Sum of row = " + sum);
    }
}


public class C6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter m & n : ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int A[][] = new int[m][n];

        System.out.println("Enter matrix : ");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        summation s[] = new summation[m];    
        for(int i=0; i<m; i++) {
            s[i] = new summation(A[i]);
            s[i].start();
        }
        for(int i=0; i<m; i++) {
            try {
                s[i].join();
            } catch (Exception e) {
            }
        }
    }
}