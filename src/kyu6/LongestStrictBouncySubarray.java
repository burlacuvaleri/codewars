/*
Kata: Longest Strict Bouncy Subarray

This kata was seen in programming competitions with a wide range of variations. 
A strict bouncy array of numbers, of length three or longer, is an array that 
each term (neither the first nor the last element) is strictly higher or lower 
than its neighbours.

For example, the array:

arr = [7,9,6,10,5,11,10,12,13,4,2,5,1,6,4,8] (length = 16)
The two longest bouncy subarrays of arr are

[7,9,6,10,5,11,10,12] (length = 8) and [4,2,5,1,6,4,8] (length = 7)
According to the given definition, the arrays [8,1,4,6,7], [1,2,2,1,4,5], 
are not bouncy.

For the special case of length 2 arrays, we will consider them strict bouncy 
if the two elements are different.

The arrays [-1,4] and [0,-10] are both bouncy, while [0,0] is not.

An array of length 1 will be considered strict bouncy itself.

You will be given an array of integers and you should output the longest strict
bouncy subarray.

In the case of having more than one bouncy subarray of same length, 
it should be output the subarray with its first term of lowest 
index in the original array.

Let's see the result for the first given example.

arr = [7,9,6,10,5,11,10,12,13,4,2,5,1,6,4,8]
longest_bouncy_list(arr) === [7,9,6,10,5,11,10,12]
See more examples in the example tests box.

Features of the random tests

length of the array inputs up to 1000
-500 <= arr[i] <= 500
Enjoy it!

Versions in Javascript and Ruby will be released soon.


arr1 = Arrays.asList(7,9,6,10,5,11,10,12,13,4,2,5,1,6,4,8), exp1 =
Arrays.asList(7,9,6,10,5,11,10,12),
 
arr2 = Arrays.asList(7,7,7,7,7), exp2 = Arrays.asList(7),
 
arr3 = Arrays.asList(1,2,3,4,5,6), exp3 = Arrays.asList(1,2);

*/

package kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LongestStrictBouncySubarray {

    public static void main(String[] args) {

        List<Integer> lista = longestBouncyList(Arrays.asList(1,2,3,4,5,6)); // Result ----> [1,2]

        System.out.println(" \nShow my list:");
        for (Integer arrLista : lista) {
            System.out.print(arrLista + " ");
        }
    }

    static List<Integer> longestBouncyList(List<Integer> arr) {
        
        // Add the first element in the results
        List<Integer> results = new ArrayList<>();
        results.add(arr.get(0));
        
        // If the 1 element is the lowest 2, add the first 2 elements 
        List<Integer> test = new ArrayList<>();
        if (arr.get(0) < arr.get(1)) {
            test.add(arr.get(0));
            test.add(arr.get(1));
        }

        // Traverse the arr
        for (int i = 1; i < arr.size() - 1; i++) {

            if (((arr.get(i) > arr.get(i - 1)) && (arr.get(i) > arr.get(i + 1)))
                    || ((arr.get(i) < arr.get(i - 1)) && (arr.get(i) < arr.get(i + 1)))) {

                if (test.isEmpty()) {
                    test.add(arr.get(i - 1));
                    test.add(arr.get(i));
                }

                test.add(arr.get(i + 1));

                if (i == arr.size() - 2) {
                    results = compareList(test, results);
                }

            } else {

                results = compareList(test, results);
              
                test = new ArrayList<>();
            }

        }
        return results;
    }

    // Compare 2 longest list
    static List compareList(List<Integer> test, List<Integer> results) {

        if (test.size() > results.size()) {
            results = test;
        }

        return results;
    }
}
