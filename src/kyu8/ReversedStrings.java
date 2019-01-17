/*
Complete the solution so that it reverses the string value passed into it.

Kata.solution("world") //returns "dlrow"
 */
package kyu8;

/**
 *
    assertEquals("dlrow", Kata.solution("world"));
 */
public class ReversedStrings {
    
    public static void main(String[] args) {
        System.out.println(solution("Buna dimineata"));
    }
    
    
    public static String solution(String str) {
//    char[] sir = str.toCharArray();
//    String reverse = "";
//    for(int i = str.length()- 1; i >=0; i--) {
//        reverse +=sir[i];
//    }
//    return reverse;
    return new StringBuilder(str).reverse().toString();
  }
    
}
