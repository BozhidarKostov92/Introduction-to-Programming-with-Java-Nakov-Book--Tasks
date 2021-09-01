package Task02;

import java.util.Scanner;

public class Task02 {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Type a number: ");
		int number = keyboard.nextInt();
		Boolean checkTheNumber;
		checkTheNumber = number % 5 == 0 && number % 7 == 0;

		if (checkTheNumber) {

			System.out.println("The number " + number + " is devisible by 5 and 7.");

		} else {

			System.out.println("The number " + number + " is not devisible by 5 and 7.");

		}
		
		keyboard.close();

	}

}
