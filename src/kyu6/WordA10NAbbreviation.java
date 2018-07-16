/*
The word i18n is a common abbreviation of internationalization in the developer 
community, used instead of typing the whole word and trying to spell it correctly.
Similarly, a11y is an abbreviation of accessibility.

Write a function that takes a string and turns any and all "words" (see below) 
within that string of length 4 or greater into an abbreviation, following these rules:

A "word" is a sequence of alphabetical characters. By this definition, any other
character like a space or hyphen (eg. "elephant-ride") will split up a series
of letters into two words (eg. "elephant" and "ride").
The abbreviated version of the word should have the first letter, then the 
number of removed characters, then the last letter (eg. "elephant ride" => "e6t r2e").
Example
abbreviate("elephant-rides are really fun!")
//          ^^^^^^^^*^^^^^*^^^*^^^^^^*^^^*
// words (^):   "elephant" "rides" "are" "really" "fun"
//                123456     123     1     1234     1
// ignore short words:               X              X

// abbreviate:    "e6t"     "r3s"  "are"  "r4y"   "fun"
// all non-word characters (*) remain in place
//                     "-"      " "    " "     " "     "!"
=== "e6t-r3s are r4y fun!"
 */
package kyu6;

/**
 *
 * @author User
 */
public class WordA10NAbbreviation {

    public static void main(String[] args) {
//        System.out.println(abbreviate("internationalization"));
        System.out.println(abbreviate("on. doggy_is, on'the"));
    }

    public static String abbreviate(String string) {
        String results = "";
        int length = 0;
        String word = "";

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                word += string.charAt(i);
                length++;
                if (i == string.length() - 1) {
                    if (length > 3){
                    results += word.substring(0, 1) + (word.length() - 2) + word.substring(word.length() - 1, word.length());
                    } else {
                        results += word;
                    }
                }
            } else {
                if (length > 3) {
                    System.out.println("word = " + word + " , length = " + length);
                    results += word.substring(0, 1) + (word.length() - 2) + word.substring(word.length() - 1, word.length()) + string.charAt(i);
                } else {
                    results += word + string.charAt(i);
                }
                word = "";
                length = 0;
            }
        }

        return results;
    }

}
