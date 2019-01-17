/*
You have an array of numbers.
Your task is to sort ascending odd numbers but even numbers must be on their places.

Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.

Example

sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]
 */
package kyu6;

/**
 *
 * @author User
 */
public class SortTheOdd {

    public static void main(String[] args) {

        int[] results = sortArray(new int[]{ 5, 3, 1, 8, 0 });
        
        for (int result : results) {
            System.out.print(result + " ");
        }
    }

    public static int[] sortArray(int[] array) {
        int length = array.length;
        if (length <= 0) {
            return array;
        }
        int i = 0;
        while (i < length) {
            while (i < length && array[i] % 2 == 0) {
                i++;
            }
            int j = i + 1;
            while (j < length) {
                while (j < length && array[j] % 2 == 0) {
                    j++;
                }
                if (j < length && array[i] % 2 != 0 && array[j] % 2 != 0 && array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                j++;
            }
            i++;
        }
        return array;
    }
}
