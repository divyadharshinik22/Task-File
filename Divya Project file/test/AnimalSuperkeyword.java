package test;

class Pet_animal{
	
	int age = 5;
	
	Pet_animal(String name){
		System.out.println("Animal");
	}
	
	void makeSound() 
	{
		System.out.println("Animal makes sound");
	}
}

class Cat extends Pet_animal{
	Cat()
	{
		super("Dog");
		super.makeSound();
		System.out.println("Cat");
		System.out.println(super.age);
	}
}

public class AnimalSuperkeyword {

	public static void main(String[] args) {
		Cat c1 = new Cat();
		
	}

}
