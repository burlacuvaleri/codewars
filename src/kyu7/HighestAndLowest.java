/*
In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Example:

HighAndLow("1 2 3 4 5") // return "5 1"
HighAndLow("1 2 -3 4 5") // return "5 -3"
HighAndLow("1 9 3 4 -5") // return "9 -5"

Notes:

    All numbers are valid Int32, no need to validate them.
    There will always be at least one number in the input string.
    Output string must be two numbers separated by a single space, and highest number is first.


 */
package kyu7;

import java.lang.reflect.Array;

/**
 *
 * @author iucosoft9
 */
public class HighestAndLowest {

    public static void main(String[] args) {

        //System.out.println(HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
        System.out.println(HighAndLow("8"));
    }

    private static String HighAndLow(String numbers) {

        String[] arrN = numbers.split(" ");
        int[] lista = new int[arrN.length];
       
        for (int i = 0; i < arrN.length; i++) {
            lista[i] = Integer.parseInt(arrN[i]);
        }
        
         if(lista.length == 1){
            return lista[0] + " " + lista[0];
        }
         
        int min = 0;
        int max = 0;
        if (lista[0] < lista[1]) {
            min = lista[0];
            max = lista[1];
        } else {
            min = lista[1];
            max = lista[0]; 
        }

        for (int i = 2; i < lista.length; i++) {
            min = lista[i] < min ? lista[i] : min;
            max = lista[i] > max ? lista[i] : max;
        }

        return max + " " + min;
        
        //varianta 2
        
//           int min = Arrays.stream(numbers.split(" "))
//                        .mapToInt(i -> Integer.parseInt(i))
//                        .min()
//                        .getAsInt();
//
//        int max = Arrays.stream(numbers.split(" "))
//                        .mapToInt(i -> Integer.parseInt(i))
//                        .max()
//                        .getAsInt();
//
//        return String.format("%d %d", max, min);


        // varianta a 3a in caz ca avem un array si sa afisam eliment Min si Max
        
//        public static int[] minMax(int[] arr) {
//        // Your awesome code here
//         Arrays.sort(arr);
//        return new int[]{arr[0],arr[arr.length-1]};
//    }

    }
}
