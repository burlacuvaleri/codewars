/*
 Write a function to convert a name into initials. This kata strictly 
takes two words with one space in between them.

The output should be two capital letters with a dot seperating them.

It should look like this:

Sam Harris => S.H
Patrick Feeney => P.F


 */
package kyu8;

/**
 *
 * @author User
 */
public class AbbreviateATwoWordName {

    public static void main(String[] args) {

        System.out.println(abbrevName("Burlacu Valeri"));
    }

    public static String abbrevName(String name) {
        String[] abb = name.split(" ");
        return abb[0].substring(0, 1).toUpperCase() + "." + abb[1].substring(0, 1).toUpperCase();
    }

}
