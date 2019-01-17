/*
You will be given an vector of string(s). You must sort it 
alphabetically (case-sensitive!!) and then return the first value.

The returned value must be a string, and have "***" between each of its letters.

You should not remove or add elements from/to the array.

 */
package kyu8;

import java.util.Arrays;

/**
 *
 * @author iucosoft9
 */
public class SortAndStar {

    public static void main(String[] args) {

        System.out.println(twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
    }

    public static String twoSort(String[] s) {
        String[] results = new String[s.length];
        
        for (int i = 0; i < s.length; i++) {
            String word = s[i].substring(0, 1);
            for (int j = 1; j < s[i].length(); j++) {
                word += "***" + s[i].substring(j, j+1);
            }
            results[i] = word;
        }
        
        Arrays.sort(results);
        return results[0];
        
        //varianta 2
        //return String.join("***",s[0].split(""));
    }
}
