package labeight;
/*
    The Transport interface declares a deliver () method. The abstract class Animal is the
    super class of the Tiger, Camel, Deer and Donkey classes. The Transport interface is
    implemented by the Camel and Donkey classes. Write a test program that initialize an
    array of four Animal objects. If the object implements the Transport interface, the
    deliver () method is invoked.
 */

interface Transport { 
    void deliver();
}

abstract class Animal {
    abstract void display();
}

class Tiger extends Animal {
    void display() {
        System.out.println("Tiger");
    }
}

class Deer extends Animal {
    void display() {
        System.out.println("Deer");
    }
}

class Camel extends Animal implements Transport {
    void display() {}
    public void deliver() {
        System.out.println("Camel is delivering");
    }
}

class Donkey extends Animal implements Transport {
    void display() {}
    public void deliver() {
        System.out.println("Donkey is delivering");
    }
}



public class C3 {
    public static void main(String[] args) {
        Animal a[] = new Animal[4];

        a[0] = new Tiger();
        a[1] = new Camel();
        a[2] = new Deer();
        a[3] = new Donkey();
        a[0].display();
        ((Transport)a[1]).deliver();
        a[2].display();
        ((Transport)a[3]).deliver();
    }
}
