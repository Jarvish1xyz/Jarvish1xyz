/*
    Write a program to demonstrate Arithmetic Exception and ArrayIndexOutOfBounds
    Exception using try-catch block.
 */


package Lab.lab_ten;


public class A1 {
    public static void main(String[] args) {
        try {
            int a = 10/0;
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        try {
            int arr[] = new int[5];
            System.out.println(arr[5]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
