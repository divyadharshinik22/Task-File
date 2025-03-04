package test;

class Laptop{
	String name = "HP";
}

class Games{
	String games_name = "CARROM";
}

public class Mainclass {

	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		System.out.println(l1.name);
		
		Games G1 = new Games();
		System.out.println(G1.games_name);

	}

}
