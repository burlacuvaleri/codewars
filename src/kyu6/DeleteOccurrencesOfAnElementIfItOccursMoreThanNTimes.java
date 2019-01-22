/*
Kata: Delete occurrences of an element if it occurs more than n times

Enough is enough!
Alice and Bob were on a holiday. Both of them took many pictures of the
places they've been, and now they want to show Charlie their entire 
collection. However, Charlie doesn't like this sessions, since the 
motive usually repeats. He isn't fond of seeing the Eiffel
tower 40 times. He tells them that he will only sit during 
the session if they show the same motive at most N times. 
Luckily, Alice and Bob are able to encode the motive as a number. 
Can you help them to remove numbers such that their list 
contains each number only up to N times, without changing the order?

Task
Given a list lst and a number N, create a new list that contains
each number of lst at most N times without reordering. 
For example if N = 2, and the input is [1,2,3,1,2,1,2,3],
you take [1,2,3,1,2], drop the next [1,2] since this would 
lead to 1 and 2 being in the result 3 times, and then take 3,
which leads to [1,2,3,1,2,3].

Example

EnoughIsEnough.deleteNth(new int[] {20,37,20,21}, 1) // return [20,37,21]
EnoughIsEnough.deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3) // return [1, 1, 3, 3, 7, 2, 2, 2]

 */
package kyu6;

import java.util.*;

public class DeleteOccurrencesOfAnElementIfItOccursMoreThanNTimes {

    public static void main(String[] args) {

        int[] rezultat = deleteNth(new int[]{1,1,3,3,7,2,2,2,2}, 3);

        // Display the results
        resultsDisplay(rezultat);

    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
 
        List<Integer> list = new ArrayList<>();
        int repeat;        
        
        // Verify if the elements is repeat
        for (int i = 0; i < elements.length; i++) {            
            repeat = 0;
            
            for (int j = 0; j < i; j++) {                
                if (elements[i] == elements[j]) {
                    repeat ++;
                }
            }
            
            // Check if element is repeated no more maxOccurrences time
            if (repeat < maxOccurrences) {
                list.add(elements[i]);
            }
            
        }
      
        // Copy the list to array
        int[] results = new int[list.size()];        
        for (int i = 0; i < results.length; i++) {
            results[i] = list.get(i);
        }

        return results;
    }

    private static void resultsDisplay(int[] results) {

        for (int element : results) {
            System.out.print(element + " ");
        }

    }
}
