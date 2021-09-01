package Task12;

import java.util.Scanner;

public class Task12 {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		int number, position, bit;

		System.out.print("Type a number: ");
		number = keyboard.nextInt();

		System.out.print("Type a position of bit: ");
		position = keyboard.nextInt();

		System.out.print("Type '1' or '0': ");
		bit = keyboard.nextInt();

		int mask = 1 << position;
		
		System.out.println(bit == 0 ? number & ~mask : number | mask);

		keyboard.close();
	}

}
