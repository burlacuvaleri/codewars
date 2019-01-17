/*
You have to create a function that takes a positive integer number 
and returns the next bigger number formed by the same digits:

Kata.nextBiggerNumber(12)==21
Kata.nextBiggerNumber(513)==531
Kata.nextBiggerNumber(2017)==2071

If no bigger number can be composed using those digits, return -1:

Kata.nextBiggerNumber(9)==-1
Kata.nextBiggerNumber(111)==-1
Kata.nextBiggerNumber(531)==-1


assertEquals(21, Kata.nextBiggerNumber(12));
         assertEquals(531, Kata.nextBiggerNumber(513));
         assertEquals(2071, Kata.nextBiggerNumber(2017));
         assertEquals(441, Kata.nextBiggerNumber(414));
         assertEquals(414, Kata.nextBiggerNumber(144));

 */
package kyu4;

import java.util.Arrays;

/**
 *
 * @author iucosoft9
 */
public class NextBiggerNumberWithTheSameSigitsV2 {

    public static void main(String[] args) {

        System.out.println(nextBiggerNumber(12));
        System.out.println(nextBiggerNumber(513));
        System.out.println(nextBiggerNumber(2017));
        System.out.println(nextBiggerNumber(233));
        System.out.println(nextBiggerNumber(414));
        System.out.println(nextBiggerNumber(144));
        System.out.println(nextBiggerNumber(9));
        System.out.println(nextBiggerNumber(111));
        System.out.println(nextBiggerNumber(531));

    }

    public static long nextBiggerNumber(long n) {
        long number = -1;

        if (n < 10) return number;

        String s1 = String.valueOf(n);
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);

        for (long i = (n) + 1; i <= (Math.pow(10, c1.length) - 1); i++) {
            String s2 = String.valueOf(i);
            char[] c2 = s2.toCharArray();
            Arrays.sort(c2);

            
            if (Arrays.equals(c1, c2)) {
                number = i;
                return number;
            }
            
        }

      
        return number;
    }

}
