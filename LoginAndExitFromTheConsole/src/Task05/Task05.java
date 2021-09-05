package Task05;

import java.util.Scanner;

public class Task05 {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		int number1, number2, maxNumber;

		System.out.print("Type a number: ");
		number1 = keyboard.nextInt();

		System.out.print("Type a number: ");
		number2 = keyboard.nextInt();

		int z = number1 - number2;
		int convertToBit = (z >> 31) & 0x1;
		maxNumber = number1 - (convertToBit * z);

		System.out.println("The biggest number is: " + maxNumber);

		keyboard.close();

	}

}
