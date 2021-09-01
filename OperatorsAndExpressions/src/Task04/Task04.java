package Task04;

import java.util.Scanner;

public class Task04 {
	
	public static void main (String args[]) {
		
		Scanner keyboard = new Scanner (System.in);
		
		
		int integer = keyboard.nextInt();		
		
		int bit = 3;
	    int result = (integer >>> (bit - 1)) & 1;

		if (result == 1) {
			
			System.out.println("The number "+ integer + " in binary is = " + Integer.toBinaryString(integer));
		    System.out.println("The third bit is 1.");

		}
		else {
			
			System.out.println("The number "+ integer + " in binary is = " + Integer.toBinaryString(integer));
			System.out.println("The third bit is not 1.");
			
		}
	    
		keyboard.close();
		
	}
	
}
