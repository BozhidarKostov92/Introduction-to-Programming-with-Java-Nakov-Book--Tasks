package Task07;

import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;


public class Task07 {

	public static void main(String argsp[]) {

		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df2 = new DecimalFormat("#.##");

		double massOnEarth, massOnMoon;

		System.out.print("Put your mass in kilos: ");
		massOnEarth = keyboard.nextInt();
		massOnMoon = massOnEarth * 0.17;

        df2.setRoundingMode(RoundingMode.HALF_UP);
		System.out.println("Your mass on the moon is " + df2.format(massOnMoon)+ " kilos.");

		keyboard.close();
	}
}
