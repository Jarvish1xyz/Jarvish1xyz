
/*
The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato.
Write a java program that demonstrates how to establish this class hierarchy. Declare
one instance variable of type String that indicates the color of a vegetable. Crete and
display instances of these objects. Override the toString() method of object to return a
string with the name of vegetable and its color.
*/

abstract class vegetable {
	String color;

	abstract public String toString();

}

class Potato extends vegetable {
	Potato() {
		super.color = "yellow";
	}

	public String toString() {
		return color;
	}
}

class Brinjal extends vegetable {

	Brinjal() {
		super.color = "purple";
	}
	
	public String toString() {
		return color;
	}
}

class Tomato extends vegetable {

    Tomato() {
		super.color = "red";
	}
	
	public String toString() {
		return color;
	}
}

public class A1 {
	public static void main(String[] args) {
		vegetable p = new Potato();
		vegetable b = new Brinjal();
		vegetable t = new Tomato();

		System.out.println("color of Potato : " + p.toString());
		System.out.println("color of Brinjal : " + b.toString());
		System.out.println("color of Tomato : " + t.toString());
	}
}