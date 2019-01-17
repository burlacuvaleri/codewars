/*
You need to write a function, that returns the first non-repeated character in the given string.

For example for string "test" function should return 'e'.
For string "teeter" function should return 'r'.

If a string contains all unique characters, then return just the first character of the string.
Example: for input "trend" function should return 't'

You can assume, that the input string has always non-zero length.
 */
package kyu7;

import com.sun.xml.internal.ws.util.StringUtils;

/**
 * test / e teeter / r 1122321235121222 / 5
 */
public class TheFirstNonRepeatedCharacterInAString {

    public static void main(String[] args) {
        
        System.out.println(firstNonRepeated("test"));
        System.out.println(firstNonRepeated("teeter"));
        System.out.println(firstNonRepeated("1122321235121222"));

    }

    public static Character firstNonRepeated(String source) {

        for (char c1 : source.toCharArray()) {
            int count = 0;
            for (char c2 : source.toCharArray()) {
                if (c1 == c2) {
                    count++;
                }
            }
            if (count == 1) {
                return c1;
            }
        }
        return ' ';    
        
        //varianta 2
        // for(char ch :str.toCharArray()) if(str.indexOf(ch) == str.lastIndexOf(ch)) return ch;
    }

}
