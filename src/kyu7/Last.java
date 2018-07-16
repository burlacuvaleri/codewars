/*
Find the last element of the given argument(s).
Examples

last(Arrays.asList(1, 2, 3, 4)); // =>  4
last("xyz");                     // => "z"
last(1, 2, 3, 4);                // =>  4
last(new int[]{1, 2, 3, 4});     // =>  4

In javascript and CoffeeScript a list will be an array, 
a string or the list of arguments.
 */
package kyu7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author iucosoft9
 */
public class Last {

    public static void main(String[] args) {

        System.out.println(last(Arrays.asList(1, 2, 3, 4))); // =>  4
        System.out.println(last("xyz"));                     // => "z"
        System.out.println(last(1, 2, 3, 4));                // =>  4
    }

    public static <T> T last(final List<T> list) {
        return list.get(list.size() - 1);        
//        if (list.size() > 0) {
//            return list.get(list.size() - 1);
//        } else {
//            return null;
//        }
    }

    public static char last(final String string) {
        return string.charAt(string.length() - 1);
//        if (string.length() > 0) {
//            return string.charAt(string.length() - 1);
//        }
//        return 0;
    }

    public static <T> T last(final T... list) {
        return list[list.length - 1];
//        if (list.length > 0) {
//            int lastIndex;
//            return list[list.length-1];
//           
//        }
//        return null;
    }

}
