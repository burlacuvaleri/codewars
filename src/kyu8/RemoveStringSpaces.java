/*
Simple, remove the spaces from the string, then return the resultant string.
 */
package kyu8;

/**
 *
 assertEquals("8j8mBliB8gimjB8B8jlB", Kata.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", Kata.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", Kata.noSpace("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", Kata.noSpace("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", Kata.noSpace("8j aam"));
 */
public class RemoveStringSpaces {
    
    public static void main(String[] args) {
        
        System.out.println(noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
    }
    
    
    static String noSpace(final String x) {
        //varianta 1
//        String[] words = x.split(" ");
//        String results = "";
//        for (String word : words) {
//            results += word;
//        }
//        return results;
        // varianta 2
        return x.replace(" ", "");
    }
}
