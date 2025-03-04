package test;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        double num1 = scan.nextDouble();
        
        System.out.println("Enter the second number:");
        double num2 = scan.nextDouble();
        
        System.out.println("Enter an operator (+, -, *, /):");
        char operator = scan.next().charAt(0);
        
        double result;
        
        scan.close();
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
                
            default:
                System.out.println("Invalid operator!");
                return;
        }
        
        System.out.println("The result is: " + result);
    }
       
}


