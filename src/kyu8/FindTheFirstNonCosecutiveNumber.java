/*
Your task is to find the first element of an array that is not consecutive.

E.g. If we have an array [1,2,3,4,6,7,8] then 1 then 2 then 3 then 4 are 
all consecutive but 6 is not, so that's the first non consecutive number.

If the whole array is consecutive then return null

The array will always have at least 2 elements and all the elements will 
be numbers. The numbers will also all be unique and in ascending order.
The numbers could be positive or negative and the first non-consecutive 
could be either too!

If you like this Kata, maybe try this one next

https://www.codewars.com/kata/represent-array-of-numbers-as-ranges
 */
package kyu8;

/**
 * assertEquals(Integer.valueOf(6), FirstNonConsecutive.find(new int[]{1, 2, 3,
 * 4, 6, 7, 8})); assertEquals(null, FirstNonConsecutive.find(new int[]{1, 2, 3,
 * 4, 5, 6, 7, 8})); assertEquals(Integer.valueOf(6),
 * FirstNonConsecutive.find(new int[]{4, 6, 7, 8, 9, 11}));
 * assertEquals(Integer.valueOf(11), FirstNonConsecutive.find(new int[]{4, 5, 6,
 * 7, 8, 9, 11})); assertEquals(null, FirstNonConsecutive.find(new int[]{31,
 * 32})); assertEquals(Integer.valueOf(0), FirstNonConsecutive.find(new
 * int[]{-3, -2, 0, 1})); assertEquals(Integer.valueOf(-1),
 * FirstNonConsecutive.find(new int[]{-5, -4, -3, -1}));
 */
public class FindTheFirstNonCosecutiveNumber {

    public static void main(String[] args) {

        System.out.println(find(new int[]{1, 2, 3, 4, 6, 7, 8}));
        System.out.println(find(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        System.out.println(find(new int[]{4, 6, 7, 8, 9, 11}));
        System.out.println(find(new int[]{4, 5, 6, 7, 8, 9, 11}));
        System.out.println(find(new int[]{31, 32}));
        System.out.println(find(new int[]{-3, -2, 0, 1}));
        System.out.println(find(new int[]{-5, -4, -3, -1}));

       
    }

    static Integer find(final int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1] - 1) {
                return array[i + 1];
            }
        }
        return null;
    }
   
}
