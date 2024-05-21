
public class Main {

	public static void main(String[] args) {
		
		Minge m = new Minge(50, 25);
		Joc j = new Joc("CSU Oradea", "FC Cojeasca", m);
		j.simuleaza();
		System.out.println(j);
	}

}
