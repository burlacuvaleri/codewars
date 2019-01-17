/*
Given a string S. You have to return another string such that even-indexed and odd-indexed characters of S are grouped and groups are space-separated (see sample below)

Note: 
0 is considered to be an even index. 
All input strings are valid with no spaces

input: 'CodeWars' output 'CdWr oeas'

S[0] = 'C'
S[1] = 'o'
S[2] = 'd'
S[3] = 'e'
S[4] = 'W'
S[5] = 'a'
S[6] = 'r'
S[7] = 's'

Even indices 0, 2, 4, 6, so we have 'CdWr' as the first group
odd ones are 1, 3, 5, 7, so the second group is 'oeas'
And the final string to return is 'Cdwr oeas'
 */
package kyu7;

/**
 * assertEquals("Wleclgltihuebredrf ofsheesenasnegrof",
 * OddEvenSort.sortMyString("Wolfeschlegelsteinhausenbergerdorff"));
 * assertEquals("MTINLHENLHENGUAIYAGNL EHOYTROYTROYLTMNLRIY",
 * OddEvenSort.sortMyString("METHIONYLTHREONYLTHREONYGLUTAMINYLARGINYL"));
 * assertEquals("PEMNUTAIRSOISLCVLAOOISS NUOOLRMCOCPCIIOOCNCNOI",
 * OddEvenSort.sortMyString("PNEUMONOULTRAMICROSCOPICSILICOVOLCANOCONIOSIS"));
 * assertEquals("PEDPEDHPPRTYODS SUOSUOYOAAHRIIM",
 * OddEvenSort.sortMyString("PSEUDOPSEUDOHYPOPARATHYROIDISM"));
 * assertEquals("FOCNUIIIIIIIAIN LCIACNHLPLFCTO",
 * OddEvenSort.sortMyString("FLOCCINAUCINIHILIPILIFICATION"));
 * assertEquals("SBEMTGYHC UDRAOLPI",
 * OddEvenSort.sortMyString("SUBDERMATOGLYPHIC"));
 */
public class OddEvenStringSort {

    public static void main(String[] args) {

        System.out.println(sortMyString("Wolfeschlegelsteinhausenbergerdorff"));
    }

    public static String sortMyString(String s) {
        String[] results = new String[]{"", ""};

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                results[0] += s.substring(i, i + 1);
            } else {
                results[1] += s.substring(i, i + 1);
            }
        }
        return results[0] + " " + results[1];
    }

}
