package test;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int s1 = scan.nextInt();
		int s2 = scan.nextInt();
		int s3 = scan.nextInt();
		int s4 = scan.nextInt();
		int s5 = scan.nextInt();
		
		int totalmark = s1+s2+s3+s4+s5;
		
		int avg = totalmark/5;
		
		if(avg<35) 
		{
		  System.out.println("ADDITIONAL CLASS REQUIRED");
		}
		else {
			System.out.println("YOU ARE GOOD TO GO");
		}
		
		if(avg>=35 && avg<=59) 
		{
			System.out.println("SECOND CLASS");
		}
		else
        if(avg>=60 && avg<=84) 
        {
			System.out.println("FIRST CLASS");
        }
        else
        if(avg>=85 && avg<=100) 
        {
			System.out.println("DISTINCTION");
        }
        else {
			System.out.println("INVALID");
        }
        scan.close(); 
	}

}
