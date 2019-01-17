/*
Given two arrays of strings a1 and a2 return a sorted array
r in lexicographical order of the strings of a1 which are
substrings of strings of a2.

#Example 1: a1 = ["arp", "live", "strong"]
a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
returns ["arp", "live", "strong"]

#Example 2: a1 = ["tarp", "mice", "bull"]
a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
returns []

Notes:

Arrays are written in "general" notation. See "Your Test Cases"
for examples in your language.

In Shell bash a1 and a2 are strings. The return is a string where
words are separated by commas.

Beware: r must be without duplicates.


String a[] = new String[]{ "arp", "live", "strong" };
String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
String r[] = new String[] { "arp", "live", "strong" };

 */
package kyu6;

import java.util.Arrays;
import jdk.nashorn.internal.runtime.RewriteException;

/**
 *
 * @author iucosoft
 */
public class WhichAreIn {

    public static void main(String[] args) {

        String a[] = new String[]{"strong", "arp", "&()", "live"};
        String b[] = new String[]{"lively", "alive", "&()", "harp", "sharp", "armstrong"};
//        String a[] = new String[]{"tarp", "mice", "bull", "ewar"};
//        String b[] = new String[]{"lively", "alive", "harp", "sharp", "armstrong", "wars"};

        System.out.println(Arrays.toString(inArray(a, b)));

    }

    public static String[] inArray(String[] array1, String[] array2) {
        int lung = 0;
        if (array1.length > array2.length) {
            lung = array1.length;
        } else {
            lung = array2.length;
        }
        String[] arrayList = new String[lung];
        int contor = 0;
        for (String elArr1 : array1) {

            for (String elArr2 : array2) {

                if (elArr2.contains(elArr1)) {
                    if (contor == 0) {
                        arrayList[0] = elArr1;
                        contor++;
                    } else {
                        boolean contain = false;

                        for (int i = 0; i < contor; i++) {
                            if (arrayList[i].contains(elArr1)) {
                                contain = true;
                            }
                        }

                        if (!contain) {
                            arrayList[contor] = elArr1;
                            contor++;
                        }
                    }
                }
            }

        }

        String[] arrayResults = new String[contor];
        for (int i = 0; i < contor; i++) {
            arrayResults[i] = arrayList[i];
        }

        boolean ascending = false;
        do {
            ascending = false;
            for (int i = 0; i < contor - 1; i++) {
                if (arrayResults[i].length() > arrayResults[i + 1].length()) {
                    String theSame = arrayResults[i];
                    arrayResults[i] = arrayResults[i + 1];
                    arrayResults[i + 1] = theSame;
                    ascending = true;
                }

            }
        } while (ascending);

        return arrayResults;
    }
}
