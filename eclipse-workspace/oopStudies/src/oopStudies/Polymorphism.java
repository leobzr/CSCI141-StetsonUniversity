package oopStudies;

public class Polymorphism {
	//example of override:
	 void draw() {
	        System.out.println("Drawing a shape");
	    }
	}

	class Circle extends Polymorphism {
	    @Override
	    void draw() {
	        System.out.println("Drawing a circle");
	    }
	    
	    
	    
	    //Example of overload
	    class MathOperations {
	        int add(int a, int b) {
	            return a + b;
	        }

	        double add(double a, double b) {
	            return a + b;
	        }

	        int add(int a, int b, int c) {
	            return a + b + c;
	        }
}
}