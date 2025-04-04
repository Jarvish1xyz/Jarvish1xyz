/*
    Write a program to create Account class, which is representing a bank account where
    we can deposit and withdraw money. If user need to withdraw money which exceed
    our minimum bank balance then it will not be allowed, and will throw
    InSufficientFundException(Custom Exception). Handle above exception and display
    proper error message.
 */


package Lab.lab_ten;

import java.util.Scanner;


class InSufficientFundException extends Exception {
    public InSufficientFundException(String message) {
        super(message);
    }
}

class Account {
    double balance;

    public Account() {
        this.balance = 0;
    }
    void deposit(int n) {
        balance +=n;
    }
    void withdraw(int n) throws InSufficientFundException {
        if(balance - n < 1000) {
            throw new InSufficientFundException("You can't withdraw this money.");
        }
    }
}


public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Account a = new Account();
            a.deposit(5000);
            System.out.println("Enter money you want to withdraw: ");
            int n = sc.nextInt();
            a.withdraw(n);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
