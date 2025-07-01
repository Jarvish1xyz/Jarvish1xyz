/* class Pen {
    String color; // red; blue
    String type; //bollpoint; gel Pen

    public void write() {
        System.out.println("writing somthing");
    }

    public void printcolor() {
        System.out.println(this.color);
    }
} */

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {}

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

}

public class OOPS {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Milan";
        s1.age = 17;

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}