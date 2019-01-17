package kyu8;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iucosoft9
 */
public class Smash {
    
    public static void main(String[] args) {
    
        System.out.println(smash(new String[] {"Bilal" , "Tatiana" ,"Ion"}));
    }

    private static String smash(String[] words) {
       String results = "";
        for (int i = 0; i < words.length; i++) {
            if(i == 0) {
                results += words[i];                
            } else {        
            results += " " + words[i];            
            }
        }
    return results; 
    }
    
}
