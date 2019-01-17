/*
Given a string of words, you need to find the highest scoring word.

Each letter of a word scores points according to it's position in the alphabet: a = 1, b = 2, c = 3 etc.

You need to return the highest scoring word as a string.

If two words score the same, return the word that appears earliest in the original string.

All letters will be lowercase and all inputs will be valid.

 */
package kyu6;

/**
 * assertEquals("taxi", Kata.high("man i need a taxi up to ubud"));
 * assertEquals("volcano", Kata.high("what time are we climbing up to the
 * volcano")); assertEquals("semynak", Kata.high("take me to semynak"));
 */
public class HighestScoringWord {

    public static void main(String[] args) {

//        System.out.println(high("man i need a taxi up to ubud"));
        System.out.println(high("mwhat time are we climbing up to the volcano"));
//        System.out.println(high("take me to semynak"));
        
    }

    public static String high(String s) {
        String results = "";
        String[] words = s.split(" ");
        int sum = 0;
        
        for (int i = 0; i < words.length; i++) {            
            int sumDigit = 0;
            int c = 0;
            for (int j = 0; j < words[i].length(); j++) {
                sumDigit += words[i].charAt(j) - 96;
                c ++;
            }
            System.out.println(words[i] + " = " + sumDigit);
            if(sum < sumDigit) {
                results = words[i];
                sum = sumDigit;
            }
        }               
        
        return results;
        
        
        //varianta 2
        
//        return Arrays.stream(s.split(" "))
//                .max(Comparator.comparingInt(
//                        a -> a.chars().map(i -> i - 96).sum()
//                )).get(); 
    }
}
