package Task06;

import java.util.Scanner;

public class Task06 {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		int a, b, h, s;

		System.out.print("Type a = ");
		a = keyboard.nextInt();

		System.out.print("Type b = ");
		b = keyboard.nextInt();

		System.out.print("Type h = ");
		h = keyboard.nextInt();

		s = ((a + b) / 2) * h;

		System.out.println("S = ((a + b) / 2) * h = " + s);

		keyboard.close();
		 	
	}

}
