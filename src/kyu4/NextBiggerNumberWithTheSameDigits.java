/*
Kata: Next bigger number with the same digits

You have to create a function that takes a positive integer number and returns the next bigger number formed by the same digits:

12 ==> 21
513 ==> 531
2017 ==> 2071

If no bigger number can be composed using those digits, return -1:

9 ==> -1
111 ==> -1
531 ==> -1

 */
package kyu4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NextBiggerNumberWithTheSameDigits {

    public static void main(String[] args) {

        System.out.println(nextBiggerNumber(3142));
        System.out.println(nextBiggerNumber(513));
        System.out.println(nextBiggerNumber(2017));
        System.out.println(nextBiggerNumber(233));
        System.out.println(nextBiggerNumber(414));
        System.out.println(nextBiggerNumber(144));
        System.out.println(nextBiggerNumber(9));
        System.out.println(nextBiggerNumber(12));
        System.out.println(nextBiggerNumber(414));
        System.out.println(nextBiggerNumber(111));
        System.out.println(nextBiggerNumber(531));

    }
    
    public static long nextBiggerNumber(long numberMin) {

        // put my Long to a List
        String strNumber = String.valueOf(numberMin);
        List<Character> list = new ArrayList<>();
        for (char c : strNumber.toCharArray()) {
            list.add(c);
        }

        // sort the List and reverse 
        Collections.sort(list);
        Collections.reverse(list);

        // obtain my Long from the List
        String str = list.stream().map(String::valueOf).collect(Collectors.joining());
        long numberMax = Long.parseLong(str);

        // to frought from numberMin to numberMax and verify if exist nextBiggerNumber
        for (long l = numberMin; l <= numberMax; l++) {

            if (listIsSimilar(l, numberMin)) {
                if (l > numberMin) {
                    return l;
                }
            }

        }

        return -1;
    }

    private static boolean listIsSimilar(long verifyLong, long myLong) {

        boolean isSimilar = false;

        List<Character> listOne = new ArrayList<>();
        String strNumber = String.valueOf(myLong);
        for (char c : strNumber.toCharArray()) {
            listOne.add(c);
        }

        List<Character> listTwo = new ArrayList<>();
        String strNumber2 = String.valueOf(verifyLong);
        for (char c : strNumber2.toCharArray()) {
            listTwo.add(c);
        }

        Collections.sort(listOne);
        Collections.sort(listTwo);

        if (listOne.toString().equals(listTwo.toString())) {
            isSimilar = true;
        }

        return isSimilar;
    }    

}
