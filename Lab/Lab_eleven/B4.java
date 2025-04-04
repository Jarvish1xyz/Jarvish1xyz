/*
    Write a program to create two threads, one thread will print odd numbers and second
    thread will print even numbers between 1 to 20 numbers.
 */


package Lab.Lab_eleven;


class odd extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if(i%2!=0) {
                System.out.println("Odd : " + i);
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
            }
        }
    }
}

class even extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if(i%2==0) {
                System.out.println("Even : " + i);
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
            }
        }
    }
}



public class B4 {
    public static void main(String[] args) {
        odd o = new odd();
        even e = new even();

        o.start();
        e.start();
    }
}
