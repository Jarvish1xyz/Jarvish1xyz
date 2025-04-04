/*
    Write a java Multithread program [A]
        i. Using Thread class.
        ii. Using Runnable Interface.
 */


package Lab.Lab_eleven;


class Demo extends Thread {
    public void run() {
        System.out.println("Thread class running");
    }
}

class Demo1 implements Runnable {
    public void run() {
        System.out.println("Runnable interface running");
    }
}



public class A1 {
    public static void main(String[] args) {
        
        Demo d1 = new Demo();
        d1.start();

        Demo1 d2 = new Demo1();
        Thread t = new Thread(d2);
        t.start();
    }
}
