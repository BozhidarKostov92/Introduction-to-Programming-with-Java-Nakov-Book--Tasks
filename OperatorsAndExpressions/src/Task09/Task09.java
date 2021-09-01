package Task09;

import java.util.Scanner;

public class Task09 {

	public static void main(String argsp[]) {

		Scanner keyboard = new Scanner(System.in);

		int x, y;

		System.out.print("Type x = ");
		x = keyboard.nextInt();

		System.out.print("Type y = ");
		y = keyboard.nextInt();

		Boolean resultOne = Math.sqrt(x * x + y * y) <= 5;
		Boolean resultTwo = x < -1 || x > 5 || y < 1 || y > 5;
		Boolean resultThree = resultOne && resultTwo;

		if (resultThree) {

			System.out.println(resultThree + " - The point O(x,y) is inside the circle and outside the rectangle.");

		} else {

			System.out.println(resultThree + " - The point O(x,y) is not inside the circle and not outside the rectangle.");

		}

		keyboard.close();
	}

}
