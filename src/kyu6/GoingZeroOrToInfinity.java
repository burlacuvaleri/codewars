package kyu6;


import java.text.DecimalFormat;

/*
Consider the following numbers (where n! is factorial(n)):

u1 = (1 / 1!) * (1!)
u2 = (1 / 2!) * (1! + 2!)
u3 = (1 / 3!) * (1! + 2! + 3!)
un = (1 / n!) * (1! + 2! + 3! + ... + n!)

Which will win: 1 / n! or (1! + 2! + 3! + ... + n!)?

Are these numbers going to 0 because of 1/n! or to infinity due to the sum of factorials?
Task

Calculate (1 / n!) * (1! + 2! + 3! + ... + n!) for a given n, where n is an integer greater or equal to 1.

To avoid discussions about rounding, return the result truncated to 6 decimal places, for example:

1.0000989217538616 will be truncated to 1.000098
1.2125000000000001 will be truncated to 1.2125

Remark

Keep in mind that factorials grow rather rapidly, and you need to handle large inputs.

 */
/**
 *
 * @author iucosoft9
 */
public class GoingZeroOrToInfinity {

    public static void main(String[] args) {
//        System.out.println(going(5));
//        System.out.println(going(6));
//        System.out.println(going(7));
        System.out.println(going(44));
    }

    public static double going(int n) {
        double results = 1e-10;
        double sum = 0;
        //int deplasare = 1000000;

        for (int i = 1; i <= n; i++) {
            sum += factorial(i);

        }
        results = 1 / factorial(n) * sum;
        // System.out.println("results = " + results);
        //results = Double.valueOf(String.format("%.6f", results));
        results *= 1000000;
        results = (int) results;
        results = results / 1000000;

        //vers 2
        //results = Double.valueOf(String.format("%.6", results));
        return results;
    }

    public static double factorial(int f) {
        double fact = 1;
        for (int i = 1; i <= f; i++) {
            fact *= i;
        }
        return fact;
    }

}
