package encapsulation;
public class EncapsulationAndAbs {

	public static void main(String[] args) {	
		String myString;
		//polymorphism means that you can have various forms of the same thing
	}
	
	
	
	//this is an example of overloading a method  - having two equal methods that receive different types
	public void eat() {
		System.out.println("nom");
	}	
	
	public void eat(int numberOfBites) {
		System.out.println("nom");
	}
	
	//Another Example:
	public void domingou() {
		System.out.println("Domingou!");
	}
	
	public void domingou(int numberofDomingos) {
		System.out.println("Nao Domingou");
	}
	
	//example of override
	void makeDomingo() {
		System.out.println("DOMINGO!");
	}
	
}
