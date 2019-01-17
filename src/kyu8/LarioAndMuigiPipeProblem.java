/*
#Issue Looks like some hoodlum plumber and his brother has been 
running around and damaging your stages again.

The pipes connecting your level's stages together need to be fixed 
before you recieve any more complaints. Each pipe should be connecting,
since the levels ascend, you can assume every number in the sequence
after the first index will be greater than the previous and that there
will be no duplicates.

#Task Given the a list of numbers, return the list so that the values
increment by 1 for each index up to the maximum value.

#Example:

Input: 1,3,5,6,7,8

Output: 1,2,3,4,5,6,7,8

 */
package kyu8;

import java.util.stream.IntStream;

/**
 *
 * @author iucosoft9
 */
public class LarioAndMuigiPipeProblem {

    public static void main(String[] args) {

        int[] rezultat = pipeFix(new int[]{44,0,65,48,0,95,125,0,448,463});
        for (int i = 0; i < rezultat.length; i++) {
            System.out.print(rezultat[i] + " ");
        }
        System.out.println("\nresults.length = " + rezultat.length);
    }

    public static int[] pipeFix(int[] numbers) {
        
        int max = IntStream.of(numbers).max().getAsInt();
        int min = numbers[0];        
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min && numbers[i] != 0) min = numbers[i];
        }                
        
        int[] results = new int[max-min+1];

        for (int i = 0; i < results.length; i++) {
            results[i] = min + i;
        }

        return results;
    }

}
