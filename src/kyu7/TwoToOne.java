/*
Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string, the longest possible, containing distinct letters,

    each taken only once - coming from s1 or s2. #Examples: ``` a = "xyaabbbccccdefww" b = "xxxxyyyyabklmopq" longest(a, b) -> "abcdefklmopqwxy"

a = "abcdefghijklmnopqrstuvwxyz" longest(a, a) -> "abcdefghijklmnopqrstuvwxyz" ```

 */
package kyu7;

import java.util.Arrays;

/**
 *
 * @author iucosoft9
 */
public class TwoToOne {

    public static void main(String[] args) {

        System.out.println(longest("aretheyhere", "yestheyarehere")); //aehrsty

    }

    public static String longest(String s1, String s2) {
        String[] arrS = (s1 + s2).split("");
        Arrays.sort(arrS);

        s1 = "";
        for (int i = 0; i < arrS.length; i++) {
            s1 += arrS[i];
        }

        return s1.replaceAll("(.)\\1{1,}", "$1");
        
        //varianta 2 
        //    String s = s1 + s2;
        //return s.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    
    
        //varianta 3
        // TreeSet<Character> set = new TreeSet<>();
//      
//      //Combine both strings into a single String
//      String s1s2 = s1 + s2;
//      //Create a StringBuilder that we will us to create our result String
//      StringBuilder sb = new StringBuilder();
//      
//      //Add all characters to TreeSet. Now they are ordered and only 1 occurence of each
//      for(int i = 0; i < s1s2.length(); i++)
//        set.add(s1s2.charAt(i));
//        
//      //Build our StringBuilder by interating over the Set  
//       for(Character c : set)
//         sb.append(c);
//        
//        //Return the result as a String
//         return new String(sb);
    }
}
