package Task10;

import java.util.Scanner;

public class Task10 {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		int abcd, a, b, c, d;

		System.out.print("Type a number: ");
		abcd = keyboard.nextInt();
		a = abcd / 1000;
		b = (abcd / 100) % 10;
		c = (abcd / 10) % 10;
		d = abcd % 10;

		System.out.println("Perform 4 actions with the number " + abcd + ": ");
		int sum = a + b + c + d;
		System.out.println("1. The sum of the digits: " +  sum);

		int dcba = d * 1000 + c * 100 + b * 10 + a;
		System.out.println("2. Reverse order: " + dcba);

		int dabc = d * 1000 + a * 100 + b * 10 + c;
		System.out.println("3. The last digit in the first place: " + dabc);

		int acbd = a * 1000 + c * 100 + b * 10 + d;
		System.out.println("4. Swaps the second and third digits: " + acbd);

		keyboard.close();
	}

}
