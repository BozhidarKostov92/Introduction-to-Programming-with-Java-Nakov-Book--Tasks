package Task02;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task02 {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df2 = new DecimalFormat("#.##");

		double radius, circumference, area;

		System.out.print("Type radius of a circle: ");
		radius = keyboard.nextDouble();

		circumference = 2 * (Math.PI * radius);
		area = Math.PI * (radius * radius);

		df2.setRoundingMode(RoundingMode.HALF_UP);

		System.out.println("Circumference of the circleis: " + df2.format(circumference));
		System.out.println("Area of the circle is: " + df2.format(area));

		keyboard.close();

	}

}
