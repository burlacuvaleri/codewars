/*
I'm new to coding and now I want to get the sum of two arrays...
actually the sum of all their elements. I'll appreciate for your help.

P.S. Each array includes only integer numbers. Output is a number too.

 */
package kyu8;

import java.util.stream.IntStream;

/**
 *
 * @author iucosoft9
 */
public class ArrayPlusArray {
    
    public static void main(String[] args) {
        
    int[] a = new int[]{1,3,4,2,5};
    int[] b = new int[]{10,8,6,9,7};
    
        System.out.println(plusArrays(a,b));
    }

    private static int plusArrays(int[] a, int[] b) {
        // problema a fost hotarita in sa vreau sa mai fac citeva exemple 
        // cu IntStream
        
        // afisez sirul a
        System.out.print("Sirul a: [");
        for (int i = 0 ; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");
        
        // afisez sirul b
        System.out.print("Sirul b: [");
        for (int i = 0 ; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("]");
                        
        System.out.println("Valoarea maxim din sirul [a] :" + IntStream.of(a).max().getAsInt());
        System.out.println("Valoarea maxim din sirul [b] :" + IntStream.of(b).max().getAsInt());
               
        System.out.println("Valoarea min din sirul [a] :" + IntStream.of(a).min().getAsInt());
        System.out.println("Valoarea min din sirul [b] :" + IntStream.of(b).min().getAsInt());
        
        System.out.println("Media Aritmetia a sirul [a] :" + IntStream.of(a).average().getAsDouble());
        System.out.println("Media Aritmetia a sirul [b] :" + IntStream.of(b).average().getAsDouble());
        
        System.out.println("Sortez sirul [a] :" + IntStream.of(a).sorted());
        System.out.println("Sortez sirul [b] :" + IntStream.of(b).sorted());        
         // afisez sirul a
        System.out.print("Sirul a: [");
        for (int i = 0 ; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");
        
        // afisez sirul b
        System.out.print("Sirul b: [");
        for (int i = 0 ; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("]");
        
        
        
        return IntStream.of(a).sum() + IntStream.of(b).sum();

    }
    
    
}
