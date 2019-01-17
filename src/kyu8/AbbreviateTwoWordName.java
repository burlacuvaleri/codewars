/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kyu8;

/**
 *
 * @author iucosoft9
 */
public class AbbreviateTwoWordName {

    public static void main(String[] args) {

        String name = "Burlacu Valeri";
        String s1 = name.substring(0, 1).toUpperCase();
        int i = 0;

        do {
            i++;

        } while (!" ".equals(name.substring(i, i + 1)));

        s1 += "." + name.substring(i + 1, i + 2).toUpperCase();

        System.out.println(s1);

    }

}
