/*
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, and u as vowels for this Kata.

The input string will only consist of lower case letters and/or spaces.
 */
package kyu7;

/**
 *
 * @author User
 */
public class VowelCount {

    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        for (char c : str.toCharArray()) {
            switch (c) {
                case 'a':
                    vowelsCount++;
                    break;
                case 'e':
                    vowelsCount++;
                    break;
                case 'i':
                    vowelsCount++;
                    break;
                case 'o':
                    vowelsCount++;
                    break;
                case 'u':
                    vowelsCount++;
                    break;
            }

        }
        return vowelsCount;

        // varianta 2
//        int vowelsCount = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if ("AEIOUaeiou".contains(str.subSequence(i, i + 1))) {
//                vowelsCount++;
//            }
//        }
//
//        return vowelsCount;
    }
}
