/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task09;

import java.util.Scanner;

/**
 *
 * @author PC User
 */
public class Task09 {

    public static void main(String[] args) {
        // Advance 
        
        Scanner keyboard = new Scanner(System.in);

        String firstName, lastName;
        char sex;
        byte age;
        int idNumber, personalNumber;

        System.out.println("First Name: ");
        firstName = keyboard.nextLine();

        System.out.println("Last Name: ");
        lastName = keyboard.nextLine();
        
        System.out.println("Sex: ");
        sex = keyboard.next().charAt(0);
        
        System.out.println("Age: ");
        age = keyboard.nextByte();
        
        System.out.println("ID Number: ");
        idNumber = keyboard.nextInt();
        
        System.out.println("Personal Number: ");
        personalNumber = keyboard.nextInt();

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Sex: " + sex);
        System.out.println("Age: " + age);
        System.out.println("ID Number: " + idNumber);
        System.out.println("Personal Number: " + personalNumber);

    }

}
