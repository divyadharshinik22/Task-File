package test;

import java.util.Scanner;

public class Votingyeartracker {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
		if(age>=18) 
		{
			System.out.println("You are Eligible for Voting");
		}
			
		if(age<18) 
		{
			System.out.println("You are not Eligible for Voting");
		}
		else  
		{
			System.out.print("Enter the start year of the range: ");
	        int startYear = scan.nextInt();
	        
	        System.out.print("Enter the end year of the range: ");
	        int endYear = scan.nextInt();
        
	        // Print all election years in the given range
	        System.out.println("Election years from " + startYear + " to " + endYear + ":");
	        
	        for (int currentYear = startYear; currentYear <= endYear; currentYear++) 
	        {
	            if (isElectionYear(currentYear)) 
	            {
	                System.out.println(currentYear);
	            }
	        }
		}
		
             scan.close();

    }
	
    private static boolean isElectionYear(int year) {
        // Assuming election years are every 5 years
        return year %5 == 0;
    }

}
