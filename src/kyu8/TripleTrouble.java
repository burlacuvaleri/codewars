/*
#Triple Trouble

Create a function that will return a string that 
combines all of the letters of the three inputed strings 
in groups. Taking the first letter of all of the inputs and
grouping them next to each other. Do this for every letter, 
see example below!

Ex) Input: "aa", "bb" , "cc" => Output: "abcabc"

Note: You can expect all of the inputs to be the same length.
 */
package kyu8;

/**
 * assertEquals("ttlheoiscstk", Kata.tripleTrouble("this", "test", "lock"));
 * assertEquals("abcabc", Kata.tripleTrouble("aa","bb","cc"));
 * assertEquals("Batman", Kata.tripleTrouble("Bm", "aa", "tn"));
 * assertEquals("LexLuthor", Kata.tripleTrouble("LLh","euo","xtr"));
 */
public class TripleTrouble {

    public static void main(String[] args) {
        System.out.println(tripleTrouble("this", "test", "lock"));
    }

    public static String tripleTrouble(String one, String two, String three) {

        String results = "";

        for (int i = 0; i < one.length(); i++) {
            results += one.substring(i, i+1) + two.substring(i, i+1)+ three.substring(i, i+1);
        }
        
        return results;
        
        
        //varianta 2
        /*
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bm.length(); i ++) {
            sb.append(bm.charAt(i));
            sb.append(aa.charAt(i));
            sb.append(tn.charAt(i));
        }
        return sb.toString();
        
        
        */
        
    }

}
