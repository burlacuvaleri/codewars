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
public class AreYouPlayingBanjo {

    public static void main(String[] args) {
        System.out.println(areYouPlayingBanjo("Radu"));

    }

    public static String areYouPlayingBanjo(String name) {
        if (name.toUpperCase().startsWith("R")) {
            return name + " plays banjo";
        } else {
            return name + " does not play banjo";
        }
    }
}
