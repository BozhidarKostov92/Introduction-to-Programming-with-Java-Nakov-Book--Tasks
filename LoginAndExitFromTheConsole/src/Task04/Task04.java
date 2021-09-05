package Task04;

import java.util.Iterator;
import java.util.Scanner;

public class Task04 {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		int number1, number2, count, devideByFive;

		System.out.print("Type a number: ");
		number1 = keyboard.nextInt();

		System.out.print("Type a number: ");
		number2 = keyboard.nextInt();

		count = 0;
		devideByFive = 0;
		for (int i = number1; i <= number2; i++) {

			if (i % 5 == 0) {

				count++;
				devideByFive = i;
			}

		}
		System.out.println("The number of the numbers between '" + number1 + "' and '" + number2
				+ "' which can be devide by 5 are: " + count);
		keyboard.close();

	}

}
