package test;

import java.util.Scanner;

public class Test8whileloop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int number, sum = 0;
        
        System.out.println(" Please Enter any integer Value below 10: ");
        number = scan.nextInt();
         
        while (number <= 10)  {
            sum = sum + number;
            number++;
        }
        System.out.format(" Sum of the Numbers From the While  Loop is: %d ", sum);
        
        scan.close();

	}

}
