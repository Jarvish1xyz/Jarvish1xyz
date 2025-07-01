import java.util.*;

public class hy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row = ");
        int row = sc.nextInt();
        System.out.print("col = ");
        int col = sc.nextInt();

        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];
        System.out.println("matrix-1 :");
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix-2 :");
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                matrix2[i][j]=sc.nextInt();
            }
        }
        System.out.println("sum of to matrix : ");
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                int sum = matrix1[i][j]+matrix2[i][j];
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}