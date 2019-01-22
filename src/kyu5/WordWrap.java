/*
Kata: Word Wrap

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

        String results = "";
        int kontor = 0;
        String lineBreak = "\n";

        
        if (text.length() <= limit) {
                results = text;
                return results;
            }
        
        if (text.substring(kontor + limit - 2, kontor + limit - 1).equals(" ")) {
            results += text.substring(kontor, kontor + limit - 2);
            text = text.substring(kontor + limit - 1);
        } else if (text.substring(kontor + limit - 1, kontor + limit).equals(" ")) {
            results += text.substring(kontor, kontor + limit - 1);
            text = text.substring(kontor + limit);
        }

        System.out.println("------------------------------------------------");
        System.out.println("results =" + results);
        System.out.println("text =" + text);
        System.out.println("------------------------------------------------");

        do {
            if (text.length() <= limit) {
                results += lineBreak + text;
                break;
            }
            
            kontor = 0;
            if (text.substring(kontor + limit - 2, kontor + limit - 1).equals(" ")) {
                results += lineBreak + text.substring(kontor, kontor + limit - 2);
                text = text.substring(kontor + limit - 1);
            } else if (text.substring(kontor + limit - 1, kontor + limit).equals(" ")) {
                results += lineBreak + text.substring(kontor, kontor + limit - 1);
                text = text.substring(kontor + limit);
            } else {
                results += lineBreak + text;
            }

        } while (text.length() >= 1);

        return results;
    }

}
