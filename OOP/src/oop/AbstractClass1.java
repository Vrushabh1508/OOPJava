package oop;

// Abstract Class having Constructor, Data Member, Abstract/ Non Abstract/ Final/ Static Methods.
abstract public class AbstractClass1 {
	static String name = "Vrushabh Nikam";
	final int age = 20;

	// This is Constructor.
	AbstractClass1() {
		System.out.println("This is a constructor in an Abstract Class.");
	}

	// This is Final method.
	final public void location() {
		System.out.println("The location of company is USA.");
	}

	// This is Non Abstract, Static method.
	public static void company() {
		System.out.println("Employee works in XYZ company.");
	}

	// This is Abstract method.
	abstract void employee(); // Abstract methods do not have method body.
}
