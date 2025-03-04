package test;

import java.util.Scanner;

public class Ternaryoperator {

	public static void main(String[] args) {
		
		boolean rain = false;
		
		String result = rain?"Take an Umbrella":"Enjoy the sunlight";
		
		System.out.println(result);
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		boolean test = (a>b);
		String answer = test  ?"A is greater":"B is greater";
		System.out.println(answer);
		scan.close();
	}

}
