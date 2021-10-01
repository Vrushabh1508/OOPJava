package oop;

public class AbstractClass2 extends AbstractClass1 {
	public void employee() {
		System.out.println("The name of employee is " + name + " and age is " + age + ".");
	}

	public static void main(String[] args) {
		AbstractClass1 A1 = new AbstractClass2(); // Abstract Class reference i.e. A1.
		A1.employee();
		AbstractClass1.company();
		A1.location();
	}
}

// Conclusion :
// An abstract class must be declared with an abstract keyword.
// Abstract Class cannot be instantiated. (i.e. We cannot create object of an Abstract Class.)
// Abstract Class can have Abstract as well as Non Abstract methods.
// Abstract Class can have Final as well as Static methods/ Data Members.
// Abstract Class can have Constructors.
