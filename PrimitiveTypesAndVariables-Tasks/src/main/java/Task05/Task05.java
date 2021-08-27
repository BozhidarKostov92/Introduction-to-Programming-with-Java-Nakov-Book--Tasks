/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task05;

import static java.lang.System.out;

/**
 *
 * @author PC User
 */
public class Task05 {

    public static void main(String args[]) {

        String hello, hello2, result, takeObjResult;

        hello = "Hello";
        hello2 = "Hello";
        result = hello + " " + hello2;
        Object takeResult = result;
        takeObjResult = takeResult.toString();

        out.println(takeResult);
        out.println(takeObjResult);

    }

}
