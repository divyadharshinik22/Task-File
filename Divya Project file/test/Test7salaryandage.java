package test;

import java.util.Scanner;

public class Test7salaryandage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int salary = scan.nextInt();
		int age = scan.nextInt();
		
		if(salary>=30000 || age<25) 
		{
		  System.out.println("Eligible for loan");
		  
		  int loan = scan.nextInt();
		  boolean loanEligible = loan<50000;
		  if(loanEligible) 
		  {
			System.out.println("Loan Available");
		  }
		  else if(loan>50000) 
		  {
			System.out.println("Loan not available");
		  }
		}
		else {
			System.out.println("No Loan");
		}

          scan.close();
	}

}
