/*
    Write a Java program to create an interface Shape with the getArea() method. Create
    three classes Rectangle, Circle, and Triangle that implement the Shape interface.
    Implement the getArea() method for each of the three classes.
 */


package Lab.lab_nine;


interface Shape {
    void getArea();
}

class Rectangle implements Shape {
    double length,width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public void getArea() {
        double area = length*width;
        System.out.println("Area of Rectangle = " + area);
    }
}

class Circle implements Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    public void getArea() {
        double area = 2*Math.PI*radius;
        System.out.println("Area of Circle = " + area);
    }
}

class Triangle implements Shape {
    double base,height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public void getArea() {
        double area = 0.5*height*base;
        System.out.println("Area of Triangle = " + area);
    }
}



public class B5 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        r.getArea();
        Circle c = new Circle(10);
        c.getArea();
        Triangle t = new Triangle(10, 20);
        t.getArea();
    }
}
