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
class Kata {
    
    public static String getMiddle(String word) {
    String sirMijloc = "";
    int lungimea = word.length();
        if (lungimea%2 == 1 ) {
            sirMijloc = word.substring(lungimea/2, lungimea/2+1);
        } else {
             sirMijloc = word.substring((lungimea/2)-1,(lungimea/2+1));
        }
        
    return sirMijloc;
  }
}
