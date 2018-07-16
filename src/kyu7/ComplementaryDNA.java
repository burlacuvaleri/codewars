/*
Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of 
cells and carries the "instructions" for the development and
functioning of living organisms.

If you want to know more http://en.wikipedia.org/wiki/DNA

In DNA strings, symbols "A" and "T" are complements of each other,
as "C" and "G". You have function with one side of the DNA (string, 
except for Haskell); you need to get the other complementary side. 
DNA strand is never empty or there is no DNA at all
(again, except for Haskell).

DnaStrand.makeComplement("ATTGC") // return "TAACG"

DnaStrand.makeComplement("GTAT") // return "CATA"
 */
package kyu7;

/**
 *
 * @author User
 */
public class ComplementaryDNA {

    public static void main(String[] args) {
        System.out.println(makeComplement("ATTGC"));
    }

    public static String makeComplement(String dna) {
        String results = "";
        for (int i = 0; i < dna.length(); i++) {
            switch (dna.substring(i, i + 1)) {
                case "A":
                    results += "T";
                    break;
                case "T":
                    results += "A";
                    break;
                case "C":
                    results += "G";
                    break;
                case "G":
                    results += "C";
                    break;
            }
        }
        return results;
    }
}
