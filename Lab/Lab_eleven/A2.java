/*
    Write an application that executes two threads. One thread displays "Good Morning"
    every 1000 milliseconds & another thread displays "Good Afternoon" every 3000
    milliseconds. Create the threads by implementing the Runnable interface.
 */



package Lab.Lab_eleven;


class goodMorning implements Runnable {
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000);
            }catch(Exception e) {}
        }
    }
}

class goodAfternoon implements Runnable {
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            System.out.println("Good Afternoon");
            try {
                Thread.sleep(3000);
            }catch(Exception e) {}
        }
    }
}



public class A2 {
    public static void main(String[] args) {
        goodMorning gm = new goodMorning();
        goodAfternoon ga = new goodAfternoon();

        Thread t1 = new Thread(gm);
        Thread t2 = new Thread(ga);
    
        t1.start();
        t2.start();
    }    
}
