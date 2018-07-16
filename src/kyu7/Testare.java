/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kyu7;

/**
 *
 * @author iucosoft9
 */
public class Testare {

    public static void main(String[] args) {
        int[] tablou = new int[]{1, 5, 55, 13, 22, 55, 44};
        int repeta = 0;
        int careNumar = 0;

        for (int i = 0; i < tablou.length-1; i++) {
            repeta = 0;
            for (int j = 1; j < tablou.length; j++) {
                if (i!=j) {
                    if (tablou[i] == tablou[j]) {
                    repeta++;
                    careNumar = tablou[j];
                }
                }
            }

            if (repeta > 0) {
                System.out.println("Numarul " + careNumar + " se repeta de " + repeta + " ori");
            }
            
        }
    }
}
