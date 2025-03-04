package test;

public class Loops {

	public static void main(String[] args) {
		
		// Example of a while loop
        int count = 1;
        System.out.println("While Loop");
        while (count <= 5) {
            System.out.println("Count is: " + count);
            count++;
        }

        // Example of a for loop
        System.out.println("\nFor Loop");
        for (int i = 1; i <= 5; i=i+1) {
            System.out.println("i is: " + i);
        }

        // Another example of a while loop
        int num = 10;
        System.out.println("\nCountdown using While Loop");
        while (num > 0) {
            System.out.println("Number: " + num);
            num--;
        }

        // Another example of a for loop
        System.out.println("\nCountdown using For Loop");
        for (int j = 10; j > 0; j--) {
            System.out.println("j is: " + j);
        }

        // Example of nested loops
        System.out.println("\nNested For Loop");
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.println("a: " + a + ", b: " + b);
            }
        }

        // Example of a do-while loop
        int x = 1;
        System.out.println("\nDo-While Loop");
        do {
            System.out.println("x is: " + x);
            x++;
        } while (x <= 5);

	}

}
