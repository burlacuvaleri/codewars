/*
HELP! Jason can't find his textbook! It is two days before the test date, and Jason's textbooks are all out of order! Help him sort a list (ArrayList in java) full of textbooks by subject, so he can study before the test.

The sorting should NOT be case sensitive

 */
package kyu8;

import java.util.Arrays;
import java.util.List;

/**
 * for(String s : new String[] {"Algebra", "History", "Geometry", "English"})
 *
 * for(String s : new String[] {"Algebra", "English", "Geometry", "History"})
 */
public class SortMyTextbooks {

    public static void main(String[] args) {

       List<String> ls = Arrays.asList("Algebra", "History", "Geometry", "English");
       
       List<String> results = sort(ls); 
        for (String elResults : results) {
            System.out.print(elResults + " ");
        }
 
    }

    public static List<String> sort(List<String> textbooks) {
        
        java.util.Collections.sort(textbooks);
        
        return textbooks;
        //Cramming right before a test can't be that bad?
    }

}
