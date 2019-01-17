/*
Compare two strings by comparing the sum of their values (ASCII character code).

    For comparing treat all letters as UpperCase
    null/NULL/Nil/None should be treated as empty strings
    If the string contains other characters than letters, treat the whole 
string as it would be empty

Your method should return true, if the strings are equal and false if they 
are not equal.
Examples:

"AD", "BC"  -> equal
"AD", "DD"  -> not equal
"gf", "FG"  -> equal
"zz1", ""   -> equal (both are considered empty)
"ZzZz", "ffPFF" -> equal
"kl", "lz"  -> not equal
null, ""    -> equal


 */
package kyu7;

public class CompareStringsSumChars {
    
    public static void main(String[] args) {
        System.out.println(compare("AD","BC"));
        System.out.println(compare("AD","DD"));
        System.out.println(compare("gf","FG"));
        System.out.println(compare("zz1",""));
        System.out.println(compare("ZzZz","ffPFF"));
        System.out.println(compare("kl","lz"));
        System.out.println(compare("null",""));
        
    }

    public static boolean compare(String s1, String s2) {
    
   if (s1 == null || s2 == null || s1.equals("") || s2.equals("") || s1.length()== 0 || s2.length()== 0) return true;
    
    int sumS1 = 0;
    int sumS2 = 0;
    s1 = s1.toUpperCase();
    s2 = s2.toUpperCase();
    
    for(int i = 0; i < s1.length(); i++){
        if(s1.charAt(i) < 65 || s1.charAt(i) > 90) return true;
        sumS1 += s1.charAt(i);
        //System.out.println(s1.charAt(i) + " = " + (int)s1.charAt(i));
        
    }
    
    for(int i = 0; i < s2.length(); i++){
        if(s2.charAt(i) < 65 || s2.charAt(i) > 90) return true;
        sumS2 += s2.charAt(i);
        //System.out.println(s2.charAt(i) + " = " + (int)s2.charAt(i));
    }    
    if (sumS1 == sumS2) {
        return true;
    } else {
        return false;
    }
    
   
  }
}
