/*
    Write a Java program that divides two numbers. If Num1 or Num2 were not an integer,
    the program would throw a Number Format Exception. If Num2 were Zero, the program
    would throw an Arithmetic Exception. Display appropriate message for each exception. 
 */


package Lab.lab_ten;

import java.util.Scanner;


public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        String num1 = sc.nextLine();
        System.out.println("Enter second number : ");
        String num2 = sc.nextLine();

        try {
            int Num1 = Integer.parseInt(num1);
            int Num2 = Integer.parseInt(num2);

            if(Num2==0) {
                throw new ArithmeticException();
            }

            int ans = Num1 / Num2;

            System.out.println("Ans = " + ans);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
