/*
Your task is to make a function that can take any non-negative integer as a argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
Examples:

Input: 21445 Output: 54421

Input: 145263 Output: 654321

Input: 1254859723 Output: 9875543221

 */
package kyu7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



/**
 *
 * @author iucosoft9
 */
public class DescendingOrder {

    public static void main(String[] args) {
        System.out.println(sortDesc(21445));
    }

    public static int sortDesc(final int num) {
        List<Integer> lista = new ArrayList<Integer>();

        int dubleor = num;
        for (int i = 0; i != dubleor; dubleor /= 10) {
            lista.add(dubleor % 10);
        }

        Collections.sort(lista);

        for (int i = lista.size() - 1; i >= 0; i--) {
            dubleor = dubleor * 10 + lista.get(i);
        }

        return dubleor;
        
        //varianta 2
//        String[] array = String.valueOf(num).split("");
//        Arrays.sort(array, Collections.reverseOrder());
//        return Integer.valueOf(String.join("", array));
        
        
    }
}
