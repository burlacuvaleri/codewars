package kyu4;

import java.util.Arrays;
 
public class NextBiggerNumberWithTheSameSigitsFinal 
{
    
     public static void main(String[] args) 
    {       
        System.out.println(nextBiggerNumber(12));
        System.out.println(nextBiggerNumber(513));
        System.out.println(nextBiggerNumber(2017));
        System.out.println(nextBiggerNumber(233));
        System.out.println(nextBiggerNumber(414));
        System.out.println(nextBiggerNumber(144));
        System.out.println(nextBiggerNumber(9));
        System.out.println(nextBiggerNumber(111));
        System.out.println(nextBiggerNumber(531));            
        
        
    }    
    
    
    // Utility function to swap two digit
    static void swap(char ar[], int i, int j) 
    {               
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
 
    // Given a number as a char array number[], 
    // this function finds the next greater number. 
    // It modifies the same array to store the result
    public static long nextBiggerNumber(long number) 
    {
        String s1 = String.valueOf(number);
        char[] ar = s1.toCharArray();
        int n = ar.length;
        long results = 0;        
        int i;
         
        // I) Start from the right most digit 
        // and find the first digit that is smaller 
        // than the digit next to it.
        for (i = n - 1; i > 0; i--) 
        {
            if (ar[i] > ar[i - 1]) {
                break;
            }
        }
         
        // If no such digit is found, then all 
        // digits are in descending order means 
        // there cannot be a greater number with 
        // same set of digits
        if (i == 0) 
        {
            return -1;
        } 
        else
        {
            int x = ar[i - 1], min = i;
             
            // II) Find the smallest digit on right 
            // side of (i-1)'th digit that is greater 
            // than number[i-1]
            for (int j = i + 1; j < n; j++) 
            {
                if (ar[j] > x && ar[j] < ar[min]) 
                {
                    min = j;
                }
            }
 
            // III) Swap the above found smallest 
            // digit with number[i-1]
            swap(ar, i - 1, min);
 
            // IV) Sort the digits after (i-1) 
            // in ascending order
            Arrays.sort(ar, i, n);
                       
            for (i = 0; i < n; i++){
              
               results = results*10 + Integer.parseInt(""+ar[i]);

            }
        }
    return results;
    }
 
   
}