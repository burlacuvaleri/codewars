/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kyu4;

import java.util.Arrays;

/**
 *
 * @author iucosoft9
 */
public class NextSmallerNumberWithTheSameDigits {

    public static void main(String[] args) {

//        assertEquals(12, Kata.nextSmaller(21));
//        assertEquals(790, Kata.nextSmaller(907));
//        assertEquals(513, Kata.nextSmaller(531));
//        assertEquals(-1, Kata.nextSmaller(1027));
//        assertEquals(414, Kata.nextSmaller(441));
//        assertEquals(123456789, Kata.nextSmaller(123456798));
        
        System.out.println(nextSmallerNumber(21));
        System.out.println(nextSmallerNumber(907));
        System.out.println(nextSmallerNumber(531));
        System.out.println(nextSmallerNumber(1027));
        System.out.println(nextSmallerNumber(441));
        System.out.println(nextSmallerNumber(123456798));
              

    }

    // Utility function to swap two digit
    static void swap(char ar[], int i, int j) {
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    // Given a number as a char array number[], 
    // this function finds the next greater number. 
    // It modifies the same array to store the result
    public static long nextSmallerNumber(long number) {
        String s1 = String.valueOf(number);
        char[] ar = s1.toCharArray();
        int n = ar.length;
        long results = 0;
        int i;

        // I) Start from the right most digit 
        // and find the first digit that is smaller 
        // than the digit next to it.
        for (i = n - 1; i > 0; i--) {
       
            if (ar[i] < ar[i - 1]) {
                break;
            }
        }

        // If no such digit is found, then all 
        // digits are in descending order means 
        // there cannot be a greater number with 
        // same set of digits
        if (i == 0) {
            return -1;
        } else {
            int x = ar[i - 1], min = i;

            // II) Find the smallest digit on right 
            // side of (i-1)'th digit that is greater 
            // than number[i-1]
            for (int j = i + 1; j < n; j++) {
                if (ar[j] < x && ar[j] > ar[min]) {
                    min = j;
                }
            }

            // III) Swap the above found smallest 
            // digit with number[i-1]
            swap(ar, i - 1, min);

            // IV) Sort the digits after (i-1) 
            // in ascending order
            Arrays.sort(ar, i, n);

            boolean zero = false;
            System.out.print("[ ");
            for (i = 0; i < n; i++) {               
                int d = Integer.parseInt("" + ar[i]);
  
                System.out.print(d + " ");
                    results = results * 10 + d;
              
            }
            System.out.println("]");
            

        }
   
        
        return results;
    }

}
