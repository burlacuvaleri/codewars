/*
Convert number to reversed array of digits
Given a random number:

C#: long;
C++: unsigned long;
You have to return the digits of this number within an array in reverse order.

Example:
348597 => [7,9,5,8,4,3]
 */
package kyu8;

/**
 *
 * @author User
 */
public class ConvertNumberToReversedArrayOfDigits {

    public static void main(String[] args) {
        int[] digits = digitize(316497);
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
    }

    public static int[] digitize(long n) {
        // Varianta 1
//        String s = new String("" + n);
//        int[] cifre = new int[s.length()];    
//        for (int i = 0; i <= s.length()-1; i++) {
//            cifre[i] = Integer.parseInt(String.valueOf(s.charAt(s.length()- 1 - i)));          
//        }
//        return cifre;
        
        // Varianta 2 :)
        return new StringBuilder().append(n)
                                  .reverse()
                                  .chars()
                                  .map(Character::getNumericValue)
                                  .toArray();
    }
}
