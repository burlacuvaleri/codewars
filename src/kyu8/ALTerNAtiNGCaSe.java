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
public class ALTerNAtiNGCaSe {

    public static void main(String[] args) {

        String string = "altERnaTIng cAsE";
        StringBuilder sb = new StringBuilder();
        String newText = "";
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    newText += Character.toLowerCase(c);
                }
                if (Character.isLowerCase(c)) {
                    newText += Character.toUpperCase(c);
                }
            } else {
                newText += string.charAt(i);
            }
        }
        
        System.out.println(" text = " + newText);     
     
    }

}
