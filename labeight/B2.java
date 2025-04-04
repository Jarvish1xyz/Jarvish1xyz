package labeight;
/*
    Write a program that illustrates interface inheritance. Interface A is extended by A1 and
    A2. Interface A12 inherits from both A1 and A2.Each interface declares one constant
    and one method. Class B implements A12.Instantiate B and invoke each of its methods.
    Each method displays one of the constants.
 */

interface A {
    int a = 1;

    public void displayA();
}

interface A1 extends A {
    int a1 = 2;

    public void displayA1();
}

interface A2 extends A {
    int a2 = 3;

    public void displayA2();
}

interface A12 extends A1, A2 {
    int a12 = 4;
    public void displayA12();
}

class B implements  A12 {
    public void displayA() {
        System.out.println("A = " + A.a);
    }
    public void displayA1() {
        System.out.println("A1 = " + A1.a1);
    }
    public void displayA2() {
        System.out.println("A2 = " + A2.a2);
    }
    public void displayA12() {
        System.out.println("A12 = " + A12.a12);
    }
}

public class B2 {
    public static void main(String[] args) {
        B x = new B();

        x.displayA();
        x.displayA1();
        x.displayA2();
        x.displayA12();
    }
}
