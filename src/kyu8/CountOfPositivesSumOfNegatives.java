/*
 Given an array of integers.

Return an array, where the first element is the count of positives 
numbers and the second element is sum of negative numbers.

If the input array is empty or null, return an empty array:

C#/Java: new int[] {} / new int[0];
C++: std::vector<int>();
JavaScript/CoffeeScript/TypeScript/PHP/Haskell: [];
Rust: Vec::<i32>::new();
ATTENTION!
The passed array should NOT be changed. Read more here.

For example:

input int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15} 
return int[] {10, -65}.
 */
package kyu8;

/**
 *
 * @author User
 */
public class CountOfPositivesSumOfNegatives {

    public static void main(String[] args) {
        int[] sir = countPositivesSumNegatives(new int[]{});

        for (int i : sir) {
            System.out.println(" " + i);
        }
    }

    public static int[] countPositivesSumNegatives(int[] input) {

        int[] results = new int[2];
        if (input == null) {
            return new int[]{};
        }
        if (input.length > 2) {
            results[0] = 0;
            results[1] = 0;

            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) {
                    results[0] = results[0] + 1;
                } else if (input[i] < 0) {
                    results[1] = results[1] + input[i];
                }
            }
            return results; //return an array with count of positives and sum of negatives
        }
        return new int[]{};

    }
}
