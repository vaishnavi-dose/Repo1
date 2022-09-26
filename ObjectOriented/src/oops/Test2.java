package oops;

public class Test2 extends Poly {

		// Main driver method
		public static void main(String[] args)
		{

			// Creating object of class 1-parent objects
			Poly a;

			// Now we will be calling print methods
			// inside main() method

			

			a = new subclass2();//child class2-autocast
			a.Print();
			
			a = new subclass1();//child class1
			a.Print();
		}

}
