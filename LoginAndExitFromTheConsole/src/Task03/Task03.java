package Task03;

import java.util.Scanner;

public class Task03 {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		String companyName, adrress, companyTel, companyFax, companyWeb, companyManager, mName, mSurname, mTelNumber;

		System.out.print("Company name: ");
		companyName = keyboard.nextLine();

		System.out.print("Company adrress: ");
		adrress = keyboard.nextLine();

		System.out.print("Company tel. number: ");
		companyTel = keyboard.nextLine();

		System.out.print("Company Fax: ");
		companyFax = keyboard.nextLine();

		System.out.print("Company WEB site: ");
		companyWeb = keyboard.nextLine();

		System.out.print("Manager of the company: ");
		companyManager = keyboard.nextLine();

		System.out.print("Manager First Name: ");
		mName = keyboard.nextLine();

		System.out.print("Manager Surname: ");
		mSurname = keyboard.nextLine();

		System.out.print("Manager tel. number: ");
		mTelNumber = keyboard.nextLine();
		System.out.println();
		System.out.println("Information for the company: "  + "\nName: " + companyName + "; Adrress: " + adrress
				+ "; Tel. number: " + companyTel + "; Fax: " + companyFax + "; WEB site: " + companyWeb + 
				"; Manager: " + companyManager);
		System.out.println();
		System.out.println(
				"Information for the Manager of the company: "+ "\nFirst Name: "+ mName + "\nSurname: " + mSurname + "\nTel. number: " + mTelNumber);

		keyboard.close();

	}

}
