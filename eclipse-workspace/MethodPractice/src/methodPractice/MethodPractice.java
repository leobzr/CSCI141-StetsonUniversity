package methodPractice;

public class MethodPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 12;
		int num2 = 15;
		
		int n1 = 23;
		int n2 = 2;
		
		String name = "Leonardo";
		
		int total = leoAdd(num1, num2); //you need to also include what the method should receive
		System.out.println(total);
		
		int result = leoMulti(n1, n2);
		System.out.println(result);
		
		leoText(name);
	}
	
	public static int leoAdd (int num1, int num2) {
		return num1+num2;
	}
	
	public static int leoMulti (int n1, int n2) {
		return n1*n2;
	}
	
	public static void leoText (String name) {
		System.out.println(name);
	}

}
