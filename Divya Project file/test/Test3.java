package test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		int age = scan.nextInt();
		scan.nextLine();
		String location = scan.nextLine();
		System.out.println("Her name is "+ name);
		System.out.println("Her age is "+ age);
		System.out.println("She lived in "+ location);
		scan.close();
	}

}
