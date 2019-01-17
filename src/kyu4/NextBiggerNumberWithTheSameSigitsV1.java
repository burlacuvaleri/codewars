/*
You have to create a function that takes a positive integer number 
and returns the next bigger number formed by the same digits:

Kata.nextBiggerNumber(12)==21
Kata.nextBiggerNumber(513)==531
Kata.nextBiggerNumber(2017)==2071

If no bigger number can be composed using those digits, return -1:

Kata.nextBiggerNumber(9)==-1
Kata.nextBiggerNumber(111)==-1
Kata.nextBiggerNumber(531)==-1


assertEquals(21, Kata.nextBiggerNumber(12));
         assertEquals(531, Kata.nextBiggerNumber(513));
         assertEquals(2071, Kata.nextBiggerNumber(2017));
         assertEquals(441, Kata.nextBiggerNumber(414));
         assertEquals(414, Kata.nextBiggerNumber(144));

 */
package kyu4;

/**
 *
 * @author iucosoft9
 */
public class NextBiggerNumberWithTheSameSigitsV1 {

    public static void main(String[] args) {

//        System.out.println(nextBiggerNumber(12));
        System.out.println(nextBiggerNumber(123456798));
//        System.out.println(nextBiggerNumber(2017));
//        System.out.println(nextBiggerNumber(233));
//        System.out.println(nextBiggerNumber(414));
//        System.out.println(nextBiggerNumber(144));
//        System.out.println(nextBiggerNumber(9));
//        System.out.println(nextBiggerNumber(111));
//        System.out.println(nextBiggerNumber(531));
     

    }

    public static long nextBiggerNumber(long n) {       
        int lengN1 = 0;
        int lengN2 = 0;
        int numarul1 = 0;
        int numarul2 = 0;
        long number1 = n;
        long number2 = -1;

        //aflu nr de cifre care le contine n
        long n2 = n;
        int nrCifre = 0;
        do {
            nrCifre ++;
            n2 /= 10;
        } while (n2 > 0);
        //System.out.println("Lungimea de cifre: " + nrCifre);
        
        int[] cifre1 = new int[nrCifre];
        
        do {
            String d = "" + Long.valueOf(n % 10);
            cifre1[lengN1] = Integer.parseInt(d);
            n /= 10;
            lengN1++;
        } while (n > 0);

   


        numarul1 = crescator(cifre1);
        System.out.println("numarul1 = " + numarul1);

        for (long i = (number1) + 1; i <= (Math.pow(10, lengN1) - 1); i++) {
            long j = i;
            int[] cifre2 = new int[nrCifre];
            numarul2 = 0;
            lengN2 = 0;

            do {
                String d = "" + Long.valueOf(j % 10);
                cifre2[lengN2] = Integer.parseInt(d);
                numarul2 += cifre2[lengN2];
                j /= 10;
                lengN2++;
            } while (j > 0);

            numarul2 = crescator(cifre2);
            if (numarul1 == numarul2) {
                number2 = i;
                //System.out.println("\nnumber1 = " + number1 + " number2 = " + number2);
                break;
            }

        }
        return number2;
    }

    private static int crescator(int[] cifre) {
        boolean change = true;
        int numar = 0;
        //aranjez cifrele in ordine crescatoare
        do {
            change = false;
            for (int i = 0; i < cifre.length - 1; i++) {
                if (cifre[i] > cifre[i + 1]) {
                    int a = cifre[i];
                    cifre[i] = cifre[i + 1];
                    cifre[i + 1] = a;
                    change = true;
                }
            }
        } while (change);

        
        // transform cifrele in numar int
        for (int i = 0; i < cifre.length; i++) {
            numar = numar * 10 + cifre[i];
        }
        
        //System.out.println("numarul = " + numar);
    
    return numar;
    }

}
