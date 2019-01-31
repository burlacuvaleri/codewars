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

public class NextSmallerNumberWithTheSameDigitsTest {

    public static void main(String[] args) {

       System.out.println(nextSmallerNumber(21));
        System.out.println(nextSmallerNumber(907));
        System.out.println(nextSmallerNumber(531));
        System.out.println(nextSmallerNumber(1027));
        System.out.println(nextSmallerNumber(782677));
        System.out.println(nextSmallerNumber(441));
        System.out.println(nextSmallerNumber(123456798));

    }
    
    public static long nextSmallerNumber(long myLongNumber) {

        long result = -1;
        
        // put my Long to a List
        String strNumber = String.valueOf(myLongNumber);
        List<Character> list = new ArrayList<>();
        for (char c : strNumber.toCharArray()) {
            list.add(c);
        }

        // sort the List and reverse 
        Collections.sort(list);
        //Collections.reverse(list);

        // obtain my Long from the List
        String str = list.stream().map(String::valueOf).collect(Collectors.joining());
        long myMinLongNumber = Long.parseLong(str);
               
        // to frought from numberMin to numberMax and verify if exist nextBiggerNumber
        //for (long l = myLongNumber; l >= myMinLongNumber; l--) {
        for (long l = myMinLongNumber; l < myLongNumber; l++) {

            if (listIsSimilar(l, myLongNumber)) {
                if (l < myLongNumber) {
                   result = l;
                }
            }

        }

        return result != -1 ? result : -1 ;
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
