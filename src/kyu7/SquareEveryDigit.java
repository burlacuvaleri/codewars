/*
Welcome. In this kata, you are asked to square every digit of a number.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.

Note: The function accepts an integer and returns an integer

 */
package kyu7;

/**
 *
 * @author iucosoft9
 */
public class SquareEveryDigit {

    public static void main(String[] args) {

        System.out.println(squareDigits(3212));
        
    }

    
    public static int squareDigits(int n) {
        
        if (n < 0) {
            return 0;
        }
        
        String results = "";
        
        for (int i = n; i > 0; i = i / 10) {
            results = (i % 10) * (i % 10) + results; 
        }
                
    return Integer.parseInt(results);
    }

}
