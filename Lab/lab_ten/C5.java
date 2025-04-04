/*
    Write a program in java if number is less than 10 and greater than 50, it generate the
    exception out of range. Else it displays the square of number.
 */


package Lab.lab_ten;

import java.util.Scanner;


public class C5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        try {
            if(num<10 || num>50) {
                throw new Exception("Out of range");
            }
            
            System.out.println("Suqare of num = " + Math.pow(num, 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
