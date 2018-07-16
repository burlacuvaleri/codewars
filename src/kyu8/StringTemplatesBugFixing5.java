/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kyu8;

/**
 *
 * @author User
 */
public class StringTemplatesBugFixing5 {

    public static void main(String[] args) {

//        System.out.println(buildString("Cheese", "Milk", "Chocolate"));
        System.out.println(buildString(" "));
    }

    private static String buildString(String... args) {
        
        if (args.length != 0 && args[0].length() != 0 && !Character.isSpaceChar(args[0].charAt(0))) {
            String results = "I like " + args[0];

            for (int i = 1; i < args.length; i++) {
                results += ", " + args[i];
            }
            results += "!";
            return results;
        }
        return "";

    }
}
