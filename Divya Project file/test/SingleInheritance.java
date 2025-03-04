package test;

class Animal{
	void eat()
	{
		System.out.print(" and eat foods");
	}
}

class Dog extends Animal{
	void Barks() 
	{
		System.out.print("Dog Barks");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.Barks();
		d1.eat();

	}

}
