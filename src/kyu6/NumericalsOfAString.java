/*
You are given an input string.

For each symbol in the string if it's the first character occurence, replace it with a '1', else replace it with the amount of times you've already seen it...

But will your code be performant enough?
Examples:

input   =  "Hello, World!"
result  =  "1112111121311"

input   =  "aaaaaaaaaaaa"
result  =  "123456789101112"

 */
package kyu6;

import java.util.Arrays;

/**
 *
 * @author iucosoft9
 */
public class NumericalsOfAString {

    public static void main(String[] args) {
//        System.out.println(numericals("Hello, World!")); //1112111121311
        System.out.println(numericals("aaaaaaaaaaaa")); //123456789101112

    }

    public static String numericals(String s) {
        StringBuilder sb = new StringBuilder();
        int repeat;
        String substring = "";
        for (int i = 0; i < s.length(); i++) {

            substring = s.substring(0, i);
            repeat = 1;

            for (int j = 0; j < substring.length(); j++) {
                if (s.charAt(i) == substring.charAt(j)) {
                    repeat++;
                }
            }

            sb.append(repeat);

        }

        return sb.toString();
    }

}
