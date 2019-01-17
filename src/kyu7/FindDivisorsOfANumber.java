/*
Find the number of divisors of a positive integer n.

Random tests go up to n = 500000.
Examples

divisors 4  = 3 -- 1, 2, 4
divisors 5  = 2 -- 1, 5
divisors 12 = 6 -- 1, 2, 3, 4, 6, 12
divisors 30 = 8 -- 1, 2, 3, 5, 6, 10, 15, 30

 */
package kyu7;

/**
 *
 * @author iucosoft9
 */
public class FindDivisorsOfANumber {

    public static void main(String[] args) {

        System.out.println(numberOfDivisors(30));
    }

    public static long numberOfDivisors(int n) {

        int results = 0;

        for (int i = 1; i <= n; i++) {
            if (n%i == 0) {
                results++;
            }
        }
        return results;
    }

//    private static boolean isDivisor(int i) {
//        int count = 0;
//        for (int j = 1; j <= i; j++) {
//            if (i % j == 0) {
//                count++;
//            }
//        }
//        
//        
//        return (count == 2)false;
//    }
}
