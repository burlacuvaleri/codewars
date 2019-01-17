/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kyu8;

/**
 *
 * @author iucosoft9
 */
public class ParseNiceIntFromCharProblem {
    
    
    public static void main(String[] args) {
    
        String str = "5 years old";
        
        System.out.println(calculate(str));
        
    }

    private static int calculate(String str) {

        return (int) Integer.parseInt(str.substring(0, 1));
        
        //varianta 2
        // return Character.getNumericValue(herOld.charAt(0));
    }
    
    
    
}
