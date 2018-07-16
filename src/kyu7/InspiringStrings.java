/*
When given a string of space separated words, return the word with the longest 
length. If there are multiple words with the longest length, return the last 
instance of the word with the longest length.

Example:

'red white blue' //returns string value of white

'red blue gold' //returns gold

 */
package kyu7;

/**
 *
 * @author iucosoft9
 */
public class InspiringStrings {
    
    public static void main(String[] args) {
        System.out.println(longestWord("a b c d e fgh"));
        System.out.println(longestWord("one two three"));
        System.out.println(longestWord("red blue grey"));
    }
    
    public static String longestWord(String wordString) {
 
        String[] words = wordString.split(" ");
        String longestWord = "";
        
        for(String word : words){
            
            if (word.length() >= longestWord.length()) longestWord = word;
            
        }
        
        return longestWord;
                
  }
    
}
