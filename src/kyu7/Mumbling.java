/*
This time no story, no theory. The examples below show you how to write function accum:

Examples:

Accumul.accum("abcd");    // "A-Bb-Ccc-Dddd"
Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
Accumul.accum("cwAt");    // "C-Ww-Aaa-Tttt"

The parameter of accum is a string which includes only letters from a..z and A..Z.

 */
package kyu7;

/**
 *
 * @author iucosoft9
 */
public class Mumbling {

    public static void main(String[] args) {

        System.out.println(accum("abcd"));
    }

    public static String accum(String s) {
        String results = "";

        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                results += s.substring(i, i + 1).toUpperCase();
            } else {
                results += "-" + s.substring(i, i + 1).toUpperCase();
            }
            for (int j = 0; j < i; j++) {
                results += s.substring(i, i + 1).toLowerCase();
            }
        }

        return results;
    }

}
