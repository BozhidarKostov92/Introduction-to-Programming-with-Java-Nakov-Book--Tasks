package Task01;

import java.util.Scanner;

public class Task01 {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		int number1, number2, number3, sum;

		System.out.print("Type a number: ");
		number1 = keyboard.nextInt();

		System.out.print("Type a number: ");
		number2 = keyboard.nextInt();

		System.out.print("Type a number: ");
		number3 = keyboard.nextInt();

		sum = number1 + number2 + number3;

		System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + sum);

		keyboard.close();

	}
}
