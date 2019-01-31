/*
Kata: Next smaller number with the same digits

Write a function that takes a positive integer and returns the next smaller positive integer containing the same digits.

For example:

nextSmaller(21) == 12
nextSmaller(531) == 513
nextSmaller(2071) == 2017

Return -1 (for Haskell: return Nothing), when there is no smaller number that contains the same digits. Also return -1 when the next smaller number with the same digits would require the leading digit to be zero.

nextSmaller(9) == -1
nextSmaller(111) == -1
nextSmaller(135) == -1
nextSmaller(1027) == -1 // 0721 is out since we don't write numbers with leading zeros

    some tests will include very large numbers.
    test data only employs positive integers.

The function you write for this challenge is the inverse of this kata: "Next bigger number with the same digits."

 */
package kyu4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextSmallerNumberWithTheSameDigits {

    public static void main(String[] args) {

//        System.out.println(nextSmallerNumber(534976)); //536974
//        System.out.println(nextSmallerNumber(21));
        System.out.println(nextSmallerNumber(907));
        System.out.println(nextSmallerNumber(531));
//        System.out.println(nextSmallerNumber(1027));
//        System.out.println(nextSmallerNumber(782677));
//        System.out.println(nextSmallerNumber(441));
//        System.out.println(nextSmallerNumber(123456798));

        char digits[] = {'5', '3', '4', '9', '7', '6'};
        int n = digits.length;
        //nextSmallerNumber(digits, n);

    }

    public static long nextSmallerNumber(long numberMax) {

        
        // m am incurcat total in codul acesta ... 
        
        
        char[] digits = String.valueOf(numberMax).toCharArray();
        int n = digits.length;
        long results = -1;
        int i;

          
        
        for (i = n - 1; i > 0; i--) {
            if ((digits[i] < digits[i - 1])
                    && digits[i] != '0') {
                System.out.println("My number=" + numberMax + " length=" + n);
                System.out.println("Break! i=" + i);
                break;
            }
        }

        // If no such digit is found, then all  
        // digits are in descending order means  
        // there cannot be a greater number with  
        // same set of digits 
        if (i == 0) {
            swap(digits, i+1 , n-1);

            // IV) Sort the digits after (i-1)  
            // in ascending order 
            Arrays.sort(digits, i, n);
            
            System.out.println("new String(digits):" + new String(digits));
            
            long finalNumber = 0;
            for (char digit : digits) {
                finalNumber *= 10 + Integer.parseInt(""+digit);
            }
            
            //long finalNumber = Long.valueOf(new String(digits));
            System.out.println("final = " + finalNumber);
            
            if (n == String.valueOf(finalNumber).length()) {
                results = finalNumber;
            }
            return results;
        } else {
            int x = digits[i - 1], min = i;

            // II) Find the smallest digit on right  
            // side of (i-1)'th digit that is greater  
            // than number[i-1] 
            for (int j = i + 1; j < n; j++) {

                if (digits[j] > x && digits[j] < digits[min]) {
                    min = j;

                }
            }

            // III) Swap the above found smallest  
            // digit with number[i-1] 
            swap(digits, i - 1, min);

            // IV) Sort the digits after (i-1)  
            // in ascending order 
            Arrays.sort(digits, i, n);

            long finalNumber = Long.valueOf(new String(digits));
            
            if (n == String.valueOf(finalNumber).length()) {
                results = finalNumber;
            }
        }

        return results;

    }

    // Utility function to swap two digit 
    static void swap(char ar[], int i, int j) {
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
