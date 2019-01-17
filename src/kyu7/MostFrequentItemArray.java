/*
Complete the function to find the count of the most frequent item of an array.
You can assume that input is an array of integers. For an empty array return 0
Example

input array: [3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3]
ouptut: 5

The most frequent number in the array is -1 and it occurs 5 times.

 */
package kyu7;

public class MostFrequentItemArray {
    public static void main(String[] args) {
        System.out.println(mostFrequentItemCount(new int[] {56, -1, -1}));
        System.out.println(mostFrequentItemCount(new int[] {1, 2, 3}));
        System.out.println(mostFrequentItemCount(new int[] {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3}));        
    }
    
    
    public static int mostFrequentItemCount(int[] collection) {
      int mostFrequent = 0;
      int repeat;
      for (int i = 0; i < collection.length; i++){
          repeat = 0;
          for(int number : collection){
              if(number == collection[i]) repeat ++;
          }
      if ((repeat > mostFrequent) && (repeat > 1)) mostFrequent = repeat;
      }
  return mostFrequent;    
  }
    
}
