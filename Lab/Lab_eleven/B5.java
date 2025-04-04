/*
    Write a java program that implements a multi-thread application that has
    three threads. First thread generates random integer every 1 second and if
    the value is even, second thread computes the square of the number and
    prints. If the value is odd, the third thread will print the value of cube of
    the number.
 */


package Lab.Lab_eleven;

class rendomFind extends Thread {
    public void run() {
        while(true) {
            int n = (int)(Math.random()*10);
    
            if(n%2==0) {
                square sq = new square(n);
                sq.start();
            }
            else {
                cube cb = new cube(n);
                cb.start();
            }
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
}

class square extends Thread {
    int n;

    square(int n) {
        this.n=n;
    }

    public void run() {
        System.out.println("Square of " + n + " is: "+(n*n));
    }
}

class cube extends Thread {
    int n;

    cube(int n) {
        this.n=n;
    }

    public void run() {
        System.out.println("Cube of " + " is: "+(n*n*n));
    }
}



public class B5 {
    public static void main(String[] args) {
        rendomFind r = new rendomFind();
        r.start();
    }
}
