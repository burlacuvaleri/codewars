/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kyu7;

/**
 *
 * remove("Hi!") === "Hi" remove("Hi!!!") === "Hi" remove("!Hi") === "!Hi"
 * remove("!Hi!") === "!Hi" remove("Hi! Hi!") === "Hi Hi" remove("!!!Hi !!hi!!!
 * !hi") === "!!!Hi !!hi !hi"
 */
public class RemoveAllExclamationMarksFromTheEndOfWords {

    public static void main(String[] args) {

        System.out.println("Dupa: " + removeBang("...o seriously!!!!!!! Seriously!! Wow!!"));

    }

    public static String removeBang(String str) {

        System.out.println("Inainte: " + str);
        String[] results = str.split(" ");

        String rezultat = "";
        for (int i = 0; i < results.length; i++) {

            boolean clear = false;

            String word = results[i];

            for (int j = 0; j < word.length(); j++) {
                if (word.endsWith("!")) {
                    word = word.substring(0, word.length()-1);
                }

            }

            if (i == 0) {
                rezultat += word;
            } else {
                rezultat += " " + word;
            }

        }

        return rezultat;
    }

}
