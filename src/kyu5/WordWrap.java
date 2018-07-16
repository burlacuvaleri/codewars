/*
Your job is to write a function that takes a string and a maximum 
number of characters per line and then inserts line breaks as 
necessary so that no line in the resulting string is longer than 
the specified limit.

If possible, line breaks should not split words. However, if a
single word is longer than the limit, it obviously has to be split. 
In this case, the line break should be placed after the first part
of the word (see examples below).

Really long words may need to be split multiple times.

#Input

A word consists of one or more letters.

Input text will be the empty string or a string consisting of one or 
more words separated by single spaces. It will not contain any punctiation 
or other special characters.

The limit will always be an integer greater or equal to one.

#Examples

Note: Line breaks in the results have been replaced with two dashes to
improve readability.

("test", 7) -> "test"
("hello world", 7) -> "hello--world"
("a lot of words for a single line", 10) -> "a lot of--words for--a single--line"
("this is a test", 4) -> "this--is a--test"
("a longword", 6) -> "a long--word"
("areallylongword", 6) -> "areall--ylongw--ord"
Note: Sometimes spaces are hard to see in the test results window.
 */
package kyu5;

/**
 *
 * @author User
 */
public class WordWrap {

    public static void main(String[] args) {
//        System.out.println(wrap("test", 7));
//        System.out.println(wrap("hello world", 7)); // "hello--world"
        System.out.println(wrap("a lot of words for a single line", 10)); //"a lot of--words for--a single--line"
//        System.out.println(wrap("this is a test", 4));
//        System.out.println(wrap("a longword", 6));
//        System.out.println(wrap("areallylongword", 6));
//  
    }

    public static String wrap(String text, int limit) {

        String results = ""; nu este finisat programul
        int contor = 0;
        String word = "";

        for (int i = 0; i < text.length(); i++) {
            contor++;

            word += text.charAt(i);

            if ((contor == limit) || (contor == limit - 1)) {
                results += (i == text.length() - 1) ? word : word + "--";
                contor = 0;
                word = "";

                if (text.substring(i+1, i + 2).equals("")) {
                    i++;
                }
            }
        }
        return results;
    }

}
