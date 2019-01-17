/*
Check to see if a string has the same amount of 'x's and 'o's. 
The method must return a boolean and be case insensitive. The string can contain any char.

Examples input/output:

XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false

 */
package kyu7;

/**
 *
 * @author iucosoft9
 */
public class ExesAndOhs {
    
    public static void main(String[] args) {
        
        System.out.println(getXO("zzoo"));
        
    }
    
    public static boolean getXO (String str) {
        int x = 0;
        int o = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i+1).equals("x")) x ++;
            if (str.substring(i, i+1).equals("o")) o ++;
        }
    
    return (x == o) ? true : false;
    
    // varianta 2 
    // str = str.toLowerCase();
    // return str.replace("o","").length() == str.replace("x","").length();
  }
}
