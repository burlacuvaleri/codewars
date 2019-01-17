/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kyu5;

/**
 *
 * @author iucosoft9
 */
public class ConvertStringToCamelCase {

    public static void main(String[] args) {

        System.out.println(toCamelCase("the-steath-warrior"));
    }

    static String toCamelCase(String s) {

        String[] words = s.split("[-_]");
        StringBuilder sb = new StringBuilder(words[0]);

        for (int i = 1; i < words.length; i++) {
            sb.append(words[i].substring(0, 1).toUpperCase() + words[i].substring(1));
        }

        return sb.toString();
    }
}
