/*
    Write a java program to create Custom Exception (DarshanUniException). Catch this
    exception using throw clause and print appropriate message.
 */


package Lab.lab_ten;

import java.util.Scanner;

class DarshanUniException extends Exception {
    public DarshanUniException(String message) {
        super(message);
    }
}


public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sc.nextLine();

        try {
            if(!str.equals("Darshan")) {
                throw new DarshanUniException("String not match");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
