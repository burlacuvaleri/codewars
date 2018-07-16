/*
 It's pretty straightforward. Your goal is to create a function that removes
the first and last characters of a string. You're given one parameter, the
original string. You don't have to worry with strings with less than two
characters.
 */
package kyu8;

/**
        assertEquals("loquen", RemoveChars.remove("eloquent"));
        assertEquals("ountr", RemoveChars.remove("country"));
        assertEquals("erso", RemoveChars.remove("person"));
        assertEquals("lac", RemoveChars.remove("place"));
 */
public class RemoveFirstandLastCharacter {
 
    public static void main(String[] args) {
        
        System.out.println(remove("eloquent"));
        System.out.println(remove("country"));
        System.out.println(remove("person"));
        System.out.println(remove("place"));
    }
    
     public static String remove(String str) {           
         return str.substring(1, str.length()-1);
    }
}
