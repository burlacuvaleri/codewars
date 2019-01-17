/*
Covfefe

Your are given a string. You must replace the word(s) coverage by covfefe,
however, if you don't find the word coverage in the string, you must add 
covfefe at the end of the string with a leading space.

For the languages where the string is not immutable (such as ruby), 
don't modify the given string, otherwise this will break the test cases.

 */
package kyu7;

/**
 *
 * @author iucosoft9 
 */
public class Covfefe {

    public static void main(String[] args) {
       // System.out.println(covfefe("nothing"));
        System.out.println(covfefe("double space "));
    }

    public static String covfefe(String tweet) {
        boolean este = tweet.toLowerCase().contains("coverage".toLowerCase());
        if (este) {
            tweet = tweet.toLowerCase().replace("coverage", "covfefe");
        } else {
            tweet += " covfefe";
        }
        return tweet;
        
        
        //varianta 2
        // return tweet.contains("coverage") ? tweet.replace("coverage", "covfefe") : tweet + " covfefe";
                
    }

}
