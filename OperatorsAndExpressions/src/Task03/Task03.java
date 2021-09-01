package Task03;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String args[]) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int number,divideNumber,result;
		
		System.out.print("Type a number: ");
		number = keyboard.nextInt();
		divideNumber = number / 100;
		result = divideNumber % 10 ;
		
		if (result == 7) {
			
			System.out.println("The third digit is 7.");
			
		}
		else {
			
			System.out.println("The third digit is not the digit 7.");
		}	
	
		keyboard.close();
	}

}
