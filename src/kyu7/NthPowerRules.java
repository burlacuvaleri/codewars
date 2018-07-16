/*
You are provided with array of positive non-zero ints and int n representing n-th power (n >= 2).

For the given array, calculate the sum of each value to the n-th power. Then subtract the sum of the original array.

Example 1: Input: {1, 2, 3}, 3 --> (1 ^ 3 + 2 ^ 3 + 3 ^ 3 ) - (1 + 2 + 3) --> 36 - 6 --> Output: 30

Example 2: Input: {1, 2}, 5 --> (1 ^ 5 + 2 ^ 5) - (1 + 2) --> 33 - 3 --> Output: 30
 */
package kyu7;

/**
 *
 * @author User
 */
public class NthPowerRules {

    public static void main(String[] args) {
        System.out.println(modifiedSum(new int[] {1,2,3}, 3));
        System.out.println(modifiedSum(new int[] {1,2}, 5));
    }

    public static int modifiedSum(int[] array, int power) {
        int sum = 0;
        for (int i : array) {
            sum += Math.pow(i, power) - i;
        }        
        return sum;
        
        //varianta 2
        // return Arrays.stream(array).map(x -> (int)Math.pow(x, power) - x).sum();
    }
}
