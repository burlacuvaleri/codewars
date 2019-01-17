/*
Write a function that takes an (unsigned) integer as input, and returns
the number of bits that are equal to one in the binary representation of that number.

Example: The binary representation of 1234 is 10011010010, so the function 
should return 5 in this case

 */
package kyu6;

/**
 *
 * @author iucosoft9
 */
public class BitCounting {

    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }

    public static int countBits(int n) {

        int results = 0;
        
        String[] digits = Integer.toBinaryString(n).split("");
        for (int i = 0; i < digits.length; i++) {
            if (digits[i].equals("1")) {
                results ++;
            }
        }
        
        return results;
        //varianta 2 
        //   return Integer.bitCount(n);
    }
}
