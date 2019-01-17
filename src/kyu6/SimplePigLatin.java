/*
Move the first letter of each word to the end of it, 
then add "ay" to the end of the word. Leave punctuation marks untouched.

Examples
pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
pigIt('Hello world !');     // elloHay orldWay !
 */
package kyu6;

public class SimplePigLatin {

    public static void main(String[] args) {

        //expected:<[Oay emporatay oay oresmay ]!> 
        // but was:<[ Oay emporatayo oresmay]!>
        //System.out.println(pigIt("O tempora o mores !"));
        //expected:<[]Cay DSdhFXuUwBTZWsay> 
        // but was:<[ ]Cay DSdhFXuUwBTZWsay>
        //System.out.println(pigIt("C sDSdhFXuUwBTZW"));
        //expected:<...RwDNwGrywWay XwJAHay[ ]>
        // but was:<...RwDNwGrywWay XwJAHay[]>
        //System.out.println(pigIt("W...RwDNwGryw HXwJA tof."));
        //System.out.println(pigIt("R...oVPsTIq vqBVedBv B")); //...oVPsTIqRay qBVedBvay[ Bay]
        //System.out.println(pigIt("Hello world !")); //pigIt('Hello world !'); // elloHay orldWay !
        System.out.println(pigIt("Pig latin is cool")); //igPay atinlay siay oolcay
        //System.out.println(pigIt("hisTay siay ymay tringsay"));
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
