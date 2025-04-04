/*
    Create interface EventListener with performEvent() method. Create MouseListener
    interface which inherits EventListener along with mouseClicked(), mousePressed(),
    mouseReleased(), mouseMoved(), mouseDragged() methods. Also create KeyListener
    interface which inherits EventListener along with keyPressed(), keyReleased() methods.
    WAP to create EventDemo class which implements MouseListener and KeyListener and
    demonstrate all the methods of the interfaces.
 */


package Lab.lab_nine;

interface  EventListener {
    void performEvent();
}

interface MouseListener extends EventListener {
    void mouseClicked();
    void mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}

interface KeyListener extends EventListener {
    void keyPressed();
    void keyReleased();
}

class EventDemo implements MouseListener, KeyListener {
    public void performEvent() {
        System.out.println("Event performed");
    }
    public void mouseClicked() {
        System.out.println("Mouse clicked");
    }
    public void mousePressed() {
        System.out.println("Mouse pressed");
    }
    public void mouseReleased() {
        System.out.println("Mouse released");
    }
    public void mouseMoved() {
        System.out.println("Mouse moved");
    }
    public void mouseDragged() {
        System.out.println("Mouse dragged");
    }
    public void keyPressed() {
        System.out.println("Key pressed");
    }
    public void keyReleased() {
        System.out.println("Key released");
    }

}


public class A4 {
    public static void main(String[] args) {
        EventDemo E1 = new EventDemo();
        E1.performEvent();
        E1.mouseClicked();
        E1.mousePressed();
        E1.mouseReleased();
        E1.mouseMoved();
        E1.mouseDragged();
        E1.keyPressed();
        E1.keyReleased();
    }
}
