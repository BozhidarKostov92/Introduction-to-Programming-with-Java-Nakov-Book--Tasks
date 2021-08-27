/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task07;

/**
 *
 * @author PC User
 */
public class Task07 {

    public static void main(String[] args) {

        // Options 3: 1-Beginer, 2-LeftToRight, 3-RightToLeft
        //1:
        //System.out.println("* ");
        //System.out.println("* *");
        //System.out.println("* * *");
        //System.out.println("* * * *");
        //2:
        char symbol = '*';

        for (int rows = 1; rows <= 4; rows++) {

            for (int columns = 1; columns <= 4 - rows; columns++) {

                if (columns <= rows) {

                    System.out.print(symbol);
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //3:
//        for (int rows = 1; rows <= 4; rows++) {
//            for (int column = 1; column <= 4 - rows; column++) {
//                System.out.print("  ");
//            }
//
//            for (int i = 1; i <= rows; i++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
    }

}
