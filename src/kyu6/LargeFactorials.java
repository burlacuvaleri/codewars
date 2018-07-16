/*
In mathematics, the factorial of integer n is written as n!.
It is equal to the product of n and every integer preceding it.
For example: 5! = 1 x 2 x 3 x 4 x 5 = 120

Your mission is simple: write a function that takes an integer n
and returns the value of n!.

You are guaranteed an integer argument. For any values outside the
non-negative range, return null, nil or None
(return an empty string "" in C and C++). For non-negative numbers a
full length number is expected for example,
return 25! = "15511210043330985984000000" as a string.

For more on factorials, see http://en.wikipedia.org/wiki/Factorial


    assertEquals("1", Kata.Factorial(1));
    assertEquals("120", Kata.Factorial(5));
    assertEquals("362880", Kata.Factorial(9));
    assertEquals("1307674368000", Kata.Factorial(15));
 */
package kyu6;

import java.math.BigInteger;

/**
 *
 * @author iucosoft
 */
public class LargeFactorials {

    public static void main(String[] args) {
        System.out.println(Factorial(1));
        System.out.println(Factorial(5));
        System.out.println(Factorial(9));
        System.out.println(Factorial(15));

    }

    public static String Factorial(int n) {
        BigInteger factor = BigInteger.valueOf(1);

        for (int i = 1; i <= n; i++) {
            factor = factor.multiply(BigInteger.valueOf(i));
        }

        return "" + factor;
    }

}
