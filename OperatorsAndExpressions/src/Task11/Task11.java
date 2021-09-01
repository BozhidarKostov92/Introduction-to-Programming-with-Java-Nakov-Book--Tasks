package Task11;

import java.util.Scanner;

public class Task11 {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		int number, bitPosition;

		System.out.print("Type a number: ");
		number = keyboard.nextInt();

		System.out.println("The number " + number + " converted to bit: " + Integer.toBinaryString(number));

		System.out.print("Type a position of the bit " + Integer.toBinaryString(number) + " : ");
		bitPosition = keyboard.nextInt();

		int i = 1;
		int mask = i << bitPosition;
		int result = number & mask;
	
		System.out.println(result != 0 ? 1 : 0);

		keyboard.close();

	}

}
