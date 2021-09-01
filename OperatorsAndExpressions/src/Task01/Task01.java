package Task01;

import java.util.Scanner;

public class Task01 {
	
	public static void main(String args[]) {		
		
		Scanner keyboard = new Scanner(System.in);
		
		int number ;
		
		System.out.print("Type a number: ");
		number = keyboard.nextInt();
		
		if (number %2 ==0) {
			
			System.out.println("The number " + number + " is even.");		
		}
		else {
			
			System.out.println("The number " + number + " is odd.");
		}
		
		keyboard.close();
	}

}
