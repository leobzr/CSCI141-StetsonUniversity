package classandobject;

public class ClassAndObject {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.make = "Ferrarri";
		myCar.model = "Enzo";
		myCar.color = "Red";
		myCar.year = 2020;
		myCar.miles = 0;
		System.out.printf("Your car is a %s, model %s, color %s, year %d and has %d miles driven.", myCar.make, myCar.model, myCar.color, myCar.year, myCar.miles );
		
		
		Cat myCat = new Cat();
		myCat.name = "Bruce";
		myCat.breed = "Half Maine Coon";
		myCat.color = "Tiger Orange";
		myCat.age = 1;
		myCat.weight = 4.85;
		System.out.printf("\n \nMy cat name is %s, his breed is %s, his color is %s, he is %d years old, and weights %.2fKg", myCat.name, myCat.breed, myCat.color, myCat.age, myCat.weight);
	}
		
		
}
