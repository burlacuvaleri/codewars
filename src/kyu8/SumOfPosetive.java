package kyu8;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iucosoft9
 */
public class SumOfPosetive {

    public static void main(String[] args) {

    System.out.println(sum(new int[]{1, 2, 3, 4, 5}));

    }

    private static int sum(int[] arr) {
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                summ += arr[i];
            }
        }

        return summ;
    }

}
