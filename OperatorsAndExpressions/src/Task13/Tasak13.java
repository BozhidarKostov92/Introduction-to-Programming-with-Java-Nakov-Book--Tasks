package Task13;

import java.util.Scanner;

public class Tasak13 {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Type a number( >1 ) : ");
		int number = keyboard.nextInt();
		
		System.out.print("2 3 5 ");
		for (int num = 2; num <= number; num++) {
			
			if (num % 2!= 0 && num % 3 !=0 && num % 5 !=0) {
				
				System.out.print(num + " ");
			}
			
		}
		
		keyboard.close();
	}
}
