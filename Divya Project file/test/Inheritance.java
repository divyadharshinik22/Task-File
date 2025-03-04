package test;

class Dad{
	int money = 1500000;
	String car = "KIA";
}

class Son extends Dad{
	
}

public class Inheritance {

	public static void main(String[] args) {
		Son s1 = new Son();
		System.out.println(s1.money);
		Son s2 = new Son();
		System.out.println(s2.car);

	}

}
