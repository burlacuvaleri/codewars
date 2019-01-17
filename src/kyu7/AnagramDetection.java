/*
An anagram is the result of rearranging the letters of a word to
produce a new word (see wikipedia).

Note: anagrams are case insensitive

Complete the function to return true if the two arguments given
are anagrams of theeach other; return false otherwise.

Examples
"foefet" is an anagram of "toffee"

"Buckethead" is an anagram of "DeathCubeK"
 */
package kyu7;

import java.util.Arrays;

/**
 assertEquals(true, k.isAnagram("foefet", "toffee"));
    assertEquals(true, k.isAnagram("Buckethead", "DeathCubeK"));
    assertEquals(true, k.isAnagram("Twoo", "Woot"));
    assertEquals(false, k.isAnagram("apple", "pale"));
 */
public class AnagramDetection {

    public static void main(String[] args) {

        System.out.println(isAnagram("Buckethead","DeathCubeK"));
    }

    public static boolean isAnagram(String test, String original) {

        char[] tempArray1 = test.toLowerCase().toCharArray();
        char[] tempArray2 = original.toLowerCase().toCharArray();
        
        Arrays.sort(tempArray1);
        Arrays.sort(tempArray2);

        return new String(tempArray1).toLowerCase().equals(new String(tempArray2).toLowerCase());
    }

}
