/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kyu8;

/**
 *
 * @author User
 */
public class StringyStrings {

    public static void main(String[] args) {

        int size = 6;
        String results = "";
        for (int i = 0; i < size; i++) {
            results += i % 2 == 0 ? "1" : "0";
        }

        System.out.println("results = " + results);
    }

}
