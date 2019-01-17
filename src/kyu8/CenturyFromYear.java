/*
Introduction

The first century spans from the year 1 up to and including the year 100, 
The second - from the year 101 up to and including the year 200, etc.
Task :

Given a year, return the century it is in.
Input , Output Examples ::

centuryFromYear(1705)  returns (18)
centuryFromYear(1900)  returns (19)
centuryFromYear(1601)  returns (17)
centuryFromYear(2000)  returns (20)

Hope you enjoy it .. Awaiting for Best Practice Codes

Enjoy Learning !!!

 */
package kyu8;

/**
 *
 * @author iucosoft9
 */
public class CenturyFromYear {

    public static void main(String[] args) {

        System.out.println(century(1029));
    }

    public static int century(int number) {

        int results = 0;

        if (number < 100) {
            return 1;
        }

        if (number % 100 > 0) {
            results = number / 100 + 1;
        } else {
            results = number / 100;        
        }         
         
        return results;
        
        //varianta 2
        //  return (number + 99) / 100;

    }

}
