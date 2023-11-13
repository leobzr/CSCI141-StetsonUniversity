package oopStudies;

abstract class AbstractionTest {
		abstract void startEngine();
		abstract void stopEngine();
		abstract void refuel();

	}

//This code is abstract (seems like e joke), it is a pseudocode, just to understand the concept of abstracion

class Car extends Vehicle { //this is an example of inheritance, we'll see it later
	@Override //this applies to polymorphism, we'll see that later
	void startEngine() {
		//Implementation for starting a car's engine
	}
	
	@Override
	void stopEngine() {
		//Implementation for stopping a car's engine
	}
	
	void refuel() {
		//Implementation for refueling a car
	}
}