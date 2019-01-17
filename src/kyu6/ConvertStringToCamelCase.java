/*
Complete the method/function so that it converts dash/underscore 
delimited words into camel casing. The first word within the output
should be capitalized only if the original word was capitalized.

Examples:
toCamelCase("the-stealth-warrior");  // returns "theStealthWarrior"

toCamelCase("The_Stealth_Warrior");  // returns "TheStealthWarrior"
 */
package kyu6;

/**
 *
 * @author User
 */
public class ConvertStringToCamelCase {

    public static void main(String[] args) {
        System.out.println(toCamelCase("the_Stealth_Warrior"));
        
        for (int i = 0; i < args.length; i++) {
            
        }

    }

    static String toCamelCase(String s) {
        String character = s.contains("-") ? "-" : "_";
        String[] words = s.split(character);
        String results = "";
        for (String word : words) {
            if (results.length() == 0) {
                results = word;
            } else {
                word = "" + Character.toUpperCase(word.charAt(0)) + word.subSequence(1, word.length());
                results += word;
            }
        }
        return results;

        //varianta 2
//        String[] words = s.split("[_\\-]");
//        s = words[0];
//        for (int i = 1; i < words.length; i++) {
//            s += words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
//        }
//        return s;
    }
}
