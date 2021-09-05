package Task07;

import java.util.Scanner;

public class Task07 {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		double number, sum;

		sum = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.print("Type a number: ");
			number = keyboard.nextDouble();
			if (number > sum) {

				sum = number;
			}
		}

		System.out.println("The sum of the numbers is: " + sum);
		keyboard.close();
	}

}
