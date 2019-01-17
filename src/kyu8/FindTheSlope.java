/*
Given an array of 4 integers
[a,b,c,d] representing two points (a, b) and (c, d), return a string 
representation of the slope of the line joining these two points.

For an undefined slope (division by 0), return undefined . 
Note that the "undefined" is case-sensitive.

   a:x1
   b:y1
   c:x2
   d:y2
Assume that [a,b,c,d] and the answer are all integers (no floating numbers!).
Slope: https://en.wikipedia.org/wiki/Slope
 */
package kyu8;

import java.util.Arrays;

/**
 *
 * assertEquals("undefined",s.slope(new int[]{-7,2,-7,4}));
 * assertEquals("5",s.slope(new int[]{10,50,30,150}));
 * assertEquals("-5",s.slope(new int[]{15,45,12,60}));
 * assertEquals("6",s.slope(new int[]{10,20,20,80}));
 * assertEquals("undefined",s.slope(new int[]{-10,6,-10,3}));
 */
public class FindTheSlope {

    public static void main(String[] args) {

//        System.out.println(slope(new int[]{12,-18,-15,-18}));
        System.out.println(slope(new int[]{-10, 6, -10, 3}));

    }

    public static String slope(int[] points) {
        
        // varianta 2 
        //return (points[0] == points[2]) ? "undefined" : "" + (points[1]-points[3])/(points[0]-points[2]);
        
        int x1 = points[0];
        int x2 = points[2];
        int y1 = points[1];
        int y2 = points[3];
        int deltaX = x2 - x1;
        int deltaY = x2 - x1;

        if (x2 - x1 == 0) {
            return "undefined";
        }

        return "" + ((int) (points[3] - points[1]) / (int) (points[2] - points[0]));
    }
}
