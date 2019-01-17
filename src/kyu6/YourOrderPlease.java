/*
Your task is to sort a given string. Each word in the String will
contain a single number. This number is the position the word should 
have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input String is empty, return an empty String. The words in the 
input String will only contain valid consecutive numbers.

For an input: "is2 Thi1s T4est 3a" the function should return "Thi1s is2 3a T4est"

your_order("is2 Thi1s T4est 3a")
[1] "Thi1s is2 3a T4est"


 */
package kyu6;

import java.util.ArrayList;
import java.util.List;

/**
 * // Order.order("is2 Thi1s T4est 3a"), equalTo("Thi1s is2 3a T4est"));
 */
public class YourOrderPlease {

    public static void main(String[] args) {

        System.out.println(order("is2 Thi1s T4est 3a"));
    }

    public static String order(String words) {
        
        if(words.length() == 0) return "";

        String[] wordSeparate = words.split(" ");
        
    
        List<String> aranje = new ArrayList<String>();
        int contor = 1;
        do {

            for (int i = 0; i < wordSeparate.length; i++) {
                if (wordSeparate[i].contains(String.valueOf(contor))) {
                    aranje.add(wordSeparate[i]);
                }
            }

            contor++;
        } while (contor <= wordSeparate.length);

        String results = aranje.get(0);
        for (int i = 1; i < aranje.size(); i++) {
            results += " " + aranje.get(i);
        }
       
        return results;
    }
}
