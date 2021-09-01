package Task08;

import java.util.Scanner;

public class Task08 {

	public static void main(String argsp[]) {

		Scanner keyboard = new Scanner(System.in);

		int x, y;

		System.out.print("Type x = ");
		x = keyboard.nextInt();

		System.out.print("Type y = ");
		y = keyboard.nextInt();

		Boolean result = Math.sqrt(x * x + y * y) <= 5;

		if (result) {

			System.out.println(result + " - The point O(x,y) is inside the circle.");

		} else {

			System.out.println(result + " - The point O(x,y) is not inside the circle.");

		}

		keyboard.close();
	}

}
