package Task05;

import java.util.Scanner;

public class Task05 {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Type length of rectangle: ");
		int length = keyboard.nextInt();

		System.out.print("Type height of rectangle: ");
		int height = keyboard.nextInt();

		int perimeter, area;

		perimeter = 2 * (length + height);
		area = length * height;

		System.out.println("Perimeter = 2 * (" + length + " + " + height + ") = " + perimeter);
		System.out.println("Area = " + length + " * " + height + " = " + area);

		keyboard.close();

	}

}
