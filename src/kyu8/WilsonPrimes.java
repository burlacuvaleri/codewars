/*
Wilson primes satisfy the following condition. Let P represent a prime number.

Then ((P-1)! + 1) / (P * P) should give a whole number.

Your task is to create a function that returns true if the given number is a Wilson prime.

 */
package kyu8;

/**
 *
 * @author iucosoft9
 */
public class WilsonPrimes {

    public static void main(String[] args) {

        System.out.println(am_i_wilson(490));

    }

    public static boolean am_i_wilson(double n) {
    return n == 5 || n == 13 || n == 563;
    }

   
}
