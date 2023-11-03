package arrayspractice;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] players = new String[11];
		players[0] = "Barry";
		players[1] = "Sanders";
		players[2] = "Rice";
		
		//System.out.println(players[2]);
		
		String[] teams = {"Nomes", "Gators", "Hatters", "Knights"};
		
		for (int i=0; i < teams.length; i++) {
			System.out.println(teams[i]);
		}
		
		//Wheater Problem:
		
		int[] weather = {45, 46, 49, 38, 37, 46, 53};
		double avg = 44.60;
		int daysabv = 0;
		int size = weather.length;
		
		for (int i=0; i < size; i++) {
			if (weather[i] >= avg) {
				daysabv++;
			}
		}
		System.out.printf("\nDays Above Average: %d", daysabv);
		
	}

}
