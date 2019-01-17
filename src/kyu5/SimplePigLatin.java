/*
Move the first letter of each word to the end of it, then 
add "ay" to the end of the word. Leave punctuation marks untouched.

Examples
pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
pigIt('Hello world !');     // elloHay orldWay !

 */
package kyu5;

/**
assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
 */
public class SimplePigLatin {

    public static void main(String[] args) {

        System.out.println(pigIt("This is my string"));
        System.out.println(pigIt("This is my s"));
    }

    public static String pigIt(String str) {
        String[] arrWords = str.split("\\s+");
        String arrResults = "";
        for (int i = 0; i < arrWords.length; i++) {
            String word = arrWords[i];

            if (word.length() == 1) {
                //este == 1 caracter
                if (word.charAt(0) == '!' || word.charAt(0) == '?' || word.charAt(0) == '.') {
                    // e ultimul caracter si e simbol
                    arrResults += " " + word;
                } else {
                    // e o litera atunci lucrez
                    if (i != 0) {
                        arrResults += " " + word + "ay";
                    } else {
                        arrResults += word + "ay";
                    }
                }

            } else {
                // este mai lung de 2 caractere si fac permutarea
                int last = word.length();
                if (word.charAt(last - 1) == '!' || word.charAt(last - 1) == '?' || word.charAt(last - 1) == '.') {
                    if (i != 0) {
                        arrResults += " " + word;
                    } else {
                        arrResults += word;
                    }
                } else {
                    if (i != 0) {
                        arrResults += " " + word.substring(1, last) + word.charAt(0) + "ay";
                    } else {
                        arrResults += word.substring(1, last) + word.charAt(0) + "ay";
                    }
                }
            }
        }
        return arrResults;
    }
}
