package kyu5;


import java.util.Arrays;

/*
A natural number is called k-prime if it has exactly k prime factors, counted with multiplicity.

A natural number is thus prime if and only if it is 1-prime.

Examples:
k = 2 -> 4, 6, 9, 10, 14, 15, 21, 22, …
k = 3 -> 8, 12, 18, 20, 27, 28, 30, …
k = 5 -> 32, 48, 72, 80, 108, 112, …
#Task:

Write function count_Kprimes (or countKprimes or count-K-primes or kPrimes) which given parameters k, start, end (or nd) returns an array (or a list or a string depending on the language - see "Solution" and "Sample Tests") of the k-primes between start (inclusive) and end (inclusive).
#Example:

countKprimes(5, 500, 600) --> [500, 520, 552, 567, 588, 592, 594]
...............................................................................

for all languages except Bash shell
Given positive integers s and a, b, c where a is 1-prime, b 3-prime, c 7-prime find the number of solutions of a + b + c = s. Call this function puzzle(s).

Examples:

puzzle(138) --> 1 ([2 + 8 + 128] is solution)
puzzle(143) --> 2 ([3 + 12 + 128, 7 + 8 + 128] are solutions)
...............................................................................

Notes:

The first function would have been better named: findKprimes or kPrimes :-)

In C some helper functions are given (see declarations in 'Solution').

For Go: nil slice is expected when there are no k-primes between start and end.
 */

public class KPrimes {
    
    
    public static void main(String[] args) {
        programul trebuie de facut
        int start = 1;
        int end = 50;
        int k = 2;
        int isPrim = 0;
        for (int i = start; i < end+1; i++) {
            isPrim = 0;
            
//            for (int j = 1; j < i; j++) {
//                if (i%j == 0) {
//                    isPrim ++;
//                }
//            }
//            System.out.println("i  = " + i);
            for (int j = 1; j < i-1; j++) {
                if (i%j == 0) {
                    isPrim ++;
//                    System.out.print(j + " ");
                }                
            }
            
//            System.out.println(" isPrim = " + isPrim);
//            System.out.println(" ");
            if (isPrim > 2) {
                System.out.println(i);
            }
            
        }
        
    }
}
