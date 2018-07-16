/*
The drawing shows 6 squares the sides of which have a length
of 1, 1, 2, 3, 5, 8.
It's easy to see that the sum of the perimeters of these squares
is : 4 * (1 + 1 + 2 + 3 + 5 + 8) = 4 * 20 = 80

Could you give the sum of the perimeters of all the squares in a rectangle
when there are n + 1 squares disposed in the same manner as in the drawing:

alternative text

#Hint: See Fibonacci sequence

#Ref: http://oeis.org/A000045

The function perimeter has for parameter n where n + 1 is the number of
squares (they are numbered from 0 to n) and returns the total perimeter
of all the squares.

perimeter(5)  should return 80
perimeter(7)  should return 216
 */
package kyu6;

import java.math.BigInteger;

public class PerimeterOfSquaresRectangle {

    public static void main(String[] args) {
//        System.out.println(perimeter(5));
//        System.out.println(perimeter(7));
//        System.out.println(perimeter(30));
        System.out.println(perimeter(BigInteger.valueOf(5)));
//        System.out.println(perimeter(BigInteger.valueOf(7)));
//        System.out.println(perimeter(BigInteger.valueOf(30)));
//        System.out.println(perimeter(BigInteger.valueOf(60325)));
    }

    public static BigInteger perimeter(BigInteger n) {
        int cicle = 0;
        BigInteger c1 = BigInteger.valueOf(0);
        BigInteger c2 = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger results = BigInteger.valueOf(0);
        int number = n.intValue();

        do {
            cicle++;
            results = results.add(c2);
            sum = c1.add(c2);
            c1 = c2;
            c2 = sum;
            //System.out.println("c1 = " + c1 + " c2 = " + c2 + " sum = " + sum);

        } while (cicle < number + 1);

        BigInteger res = results.multiply(BigInteger.valueOf(4));
        return res;

    }

}
