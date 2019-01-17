/*
Tale University is a bit messy, and can't maintain an ordered list of their student. 
Tale's dean wants to print a sortet list of his students by the gpa, last name
and age and post it on the walls so everybody can be impressed of his great students.

Given a list of students, sort them by (from most important to least important):

    GPA (descending)
    First letter of last name (ascending)
    Age (ascending)

And the class Student:

class Student {
    ...
  int getGpa()
  int getAge();
  String getFullName();
}

Return the sorted result as full names string, comma separated.

For Example, given the list (name, age, gpa):

    David Goodman, 23, 88
    Mark Rose, 25, 82
    Jane Doe, 22, 90
    Jane Dane, 25, 90

sort(students) should return "Jane Doe,Jane Dane,David Goodman,Mark Rose"


 */
package kyu6;

import java.util.List;

/**
 *
 * @author iucosoft9
 */
public class TripleSortingSortStringifyAListBy3Attributes {

    public static void main(String[] args) {

    }

    public static String sort(List<Student> students) {
        return "";
    }

    public static class Student {
//
//        int getGpa();
//
//        int getAge();
//
//        String getFullName();
    }
}
