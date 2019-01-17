/*
Given an array, find the int that appears an odd number of times.

There will always be only one integer that appears an odd number of times.

assertEquals(5, FindOdd.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5})); 
assertEquals(-1, FindOdd.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5})); 
assertEquals(5, FindOdd.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
assertEquals(10, FindOdd.findIt(new int[]{10}));
assertEquals(10, FindOdd.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
assertEquals(1, FindOdd.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
 */
package kyu6;

/**
 *
 * @author User
 */
public class FindTheOddInt {
    
    
    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
//        System.out.println(findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
//        System.out.println(findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
//        System.out.println(findIt(new int[]{10}));
//        System.out.println(findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
//        System.out.println(findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));

        
    }
    
    
    
    	public static int findIt(int[] a) {
            int c = 0;
            for (int i : a) {
               
                c = 0;
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == i) {
                        c++;                       
                    }
                }
                
                if (c%2 == 1) {
                   return i;
                }            
                               
            }
            
  	return 0;
  }
}
