/*
Implement String#digit? (in Java StringUtils.isDigit(String)), which should return true if given object is a digit (0-9), false otherwise.
 */
package kyu8;

/**
 *
 * @author User
 */
public class RegexpBasicsIsItADigit {
    
    public static void main(String[] args) {
        String s = "2 d9";
        
        System.out.println(isDigit(s));
    }

    private static boolean isDigit(String s) {
        return (s.length() == 1) ? Character.isDigit(s.charAt(0)) : false;
        
        // varianta 2
        //  return s.matches("[0-9]");
    }
   
  
}
