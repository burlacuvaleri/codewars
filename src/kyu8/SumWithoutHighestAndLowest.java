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
public class SumWithoutHighestAndLowest {

    public static void main(String[] args) {

        //int[] numbers = new int[] {6, 2, 1, 8, 10};
        int[] numbers = new int[]{ 1, 2, 3};
        //int[] numbers = null;

        if ((numbers.length == 0) || (numbers==null) || (numbers.length == 1)) {
            System.out.println("=0");;
        } else {
            int max = numbers[0];
            int min = numbers[0];
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
               
                if (numbers[i] < min) min = numbers[i];
                if (numbers[i] > max) max = numbers[i];
                sum += numbers[i];
            }
            sum -= min + max;
            System.out.println("sum = " + sum);
        }
        
           


    }
}
