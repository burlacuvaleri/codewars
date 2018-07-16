/*
Given an array of one's and zero's convert the equivalent binary value to an integer.

Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.

Examples:

Testing: [0, 0, 0, 1] ==> 1
Testing: [0, 0, 1, 0] ==> 2
Testing: [0, 1, 0, 1] ==> 5
Testing: [1, 0, 0, 1] ==> 9
Testing: [0, 0, 1, 0] ==> 2
Testing: [0, 1, 1, 0] ==> 6
Testing: [1, 1, 1, 1] ==> 15
Testing: [1, 0, 1, 1] ==> 11
However, the arrays can have varying lengths, not just limited to 4.
 */
package kyu7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author User
 */
public class OnesAndZeros {
 
    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,1,1))));
    }
    
     public static int ConvertBinaryArrayToInt(List<Integer> binary) {
//         String value = "";
//         for (Integer integer : binary) {
//             value += integer;
//         }
        
        return Integer.parseInt(binary.get(0).toString()+binary.get(1).toString()+binary.get(2).toString()+binary.get(3).toString(),2);
        //   return binary.stream().reduce((x, y) -> x * 2 + y).get();
     }
}
