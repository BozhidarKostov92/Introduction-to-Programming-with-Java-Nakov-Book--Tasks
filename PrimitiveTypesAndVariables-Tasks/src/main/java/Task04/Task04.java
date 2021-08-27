/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task04;

import java.util.Scanner;

/**
 *
 * @author PC User
 */
public class Task04 {
    
    public static void main (String args[]){
    
        Scanner keyboard = new Scanner(System.in);
        
        String maleOrFemale = keyboard.next();
        String lowLetter = maleOrFemale.toLowerCase();
        boolean isMale = true;
        
        if (lowLetter.equals ("male")) {
            
            System.out.println(isMale);
        }      
        else {
            System.out.println("false");
        }
    }
}
