/*
Kata: Calculator

Create a simple calculator that given a string of operators (+ - * and /) and numbers separated by spaces returns the value of that expression

Example:

Calculator.evaluate("2 / 2 + 3 * 4 - 6") // => 7

Remember about the order of operations! Multiplications and divisions have a higher priority and should be performed left-to-right. Additions and subtractions have a lower priority and should also be performed left-to-right.

 */
package kyu3;

import java.util.Arrays;
import java.util.List;

public class Calculator {

    public static void main(String[] args) {

//        System.out.println(evaluate("2 + 3 / 3 - 1 * 5"));
//        System.out.println(evaluate("2 + 3"));
//        System.out.println(evaluate("2 - 3 - 4"));
        System.out.println(evaluate("10 * 5 / 5"));
//        System.out.println(evaluate("127"));

    }

    static List<String> numAndOperators;
    static int i = 1;

    private static Double evaluate(String expression) {

        numAndOperators = Arrays.asList(expression.split(" "));

        while (numAndOperators.size() - 2 >= i) {

            
            if ((numAndOperators.get(i).equals("*"))
                    || (numAndOperators.get(i).equals("/"))) {
                
                // calculate the operations: * or /
                calculate(i, numAndOperators.get(i - 1), numAndOperators.get(i), numAndOperators.get(i + 1));

            } else if ((numAndOperators.get(i).equals("+")
                    || numAndOperators.get(i).equals("-"))
                    && (!numAndOperators.contains("*") && (!numAndOperators.contains("/")))) {

                // calculate the operations + or -
                calculate(i, numAndOperators.get(i - 1), numAndOperators.get(i), numAndOperators.get(i + 1));

            }

            // incriment the next position of list
            i++;
        }

        return Double.valueOf(numAndOperators.get(0));
    }

    private static void calculate(int position, String get, String get0, String get1) {

        // make the operation
        double results = 0;
        double a = Double.valueOf(get);
        double b = Double.valueOf(get1);

        switch (get0) {

            case "*":
                results = a * b;
                break;
            case "/":
                results = a / b;
                break;
            case "+":
                results = a + b;
                break;
            case "-":
                results = a - b;
                break;

        }

        // set the value at the position i-1
        numAndOperators.set(position - 1, String.valueOf(results));

        // move the list to left
        for (int j = position; j < numAndOperators.size() - 2; j++) {
            numAndOperators.set(j, numAndOperators.get(j + 2));
        }

        // refresh the list
        numAndOperators = numAndOperators.subList(0, numAndOperators.size() - 2);
        
        // start from begining to calculate
        i = 0;
    }

}