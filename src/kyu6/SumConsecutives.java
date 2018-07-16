/*
You are given a list/array which contains only integers (positive and negative). Your job is to sum only the numbers that are the same and consecutive. The result should be one list.

Extra credit if you solve it in one line. You can asume there is never an empty list/array and there will always be an integer.

Same meaning: 1 == 1

1 != -1

#Examples:

[1,4,4,4,0,4,3,3,1] # should return [1,12,0,4,6,1]

"""So as you can see sum of consecutives 1 is 1 
sum of 3 consecutives 4 is 12 
sum of 0... and sum of 2 
consecutives 3 is 6 ..."""

[1,1,7,7,3] # should return [2,14,3]
[-5,-5,7,7,12,0] # should return [-10,14,12,0]
 */
package kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author User
 */
public class SumConsecutives {

    public static void main(String[] args) {

        List<Integer> s = Arrays.asList(1, 4, 4, 4, 0, 4, 3, 3, 1);
        List<Integer> list = sumConsecutives(s);
        for (Integer elList : list) {
            System.out.println(elList + " ");
        }

    }

    public static List<Integer> sumConsecutives(List<Integer> s) {
        List<Integer> results = new ArrayList<>();
        int sum = s.get(0);
        for (int i = 1; i < s.size(); i++) {
            if (s.get(i) == s.get(i - 1)) {
                sum += s.get(i);
            } else {
                results.add(sum);
                sum = s.get(i);
            }

            if (i == s.size() - 1) {
                results.add(sum);
            }
        }
        return results;
        
        
        // varianta 2
        //  int previous = Integer.MAX_VALUE;
        /*
      LinkedList<Integer> l = new LinkedList<>();
      for (Integer v: s){
         l.add(v == previous? l.pollLast() + v : v); 
         previous = v;
      }
      return l; */
    }
}
