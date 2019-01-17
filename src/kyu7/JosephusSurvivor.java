/*
In this kata you have to correctly return who is the "survivor", ie: the last element of a Josephus permutation.

Basically you have to assume that n people are put into a circle and that they are eliminated in steps of k elements, like this:

josephus_survivor(7,3) => means 7 people in a circle;
one every 3 is eliminated until one remains
[1,2,3,4,5,6,7] - initial sequence
[1,2,4,5,6,7] => 3 is counted out
[1,2,4,5,7] => 6 is counted out
[1,4,5,7] => 2 is counted out
[1,4,5] => 7 is counted out
[1,4] => 5 is counted out
[4] => 1 counted out, 4 is the last element - the survivor!

The above link about the "base" kata description will give you a more thorough insight about the origin of this kind of permutation, but basically that's all that there is to know to solve this kata.

Notes and tips: using the solution to the other kata to check your function may be helpful, but as much larger numbers will be used, using an array/list to compute the number of the survivor may be too slow; you may assume that both n and k will always be >=1.

 */
package kyu7;

public class JosephusSurvivor {

    public static void main(String[] args) {

        System.out.println(josephusSurvivor(7, 3));

    }

    public static int josephusSurvivor(final int n, final int k) {
        int[] nNumbers = new int[n];
        int[] nCircula = new int[n];
        int parcurgere = 0;
        int i = 0;
        int contor = -1;
        int theLast = 0;
        for (int j = 0; j < n; j++) {
            nNumbers[j] = j + 1;
            nCircula[j] = 0;
        }
        do {
            i++;
            contor++;
            if (nCircula[contor] == 0) {
                if (i == k) {
                    nCircula[contor] = 1;
                    theLast = nNumbers[contor];
                    parcurgere++;
                    i = 0;                }
            } else { i -= 1; }
            if (contor == n - 1) { contor = -1; }
        } while (parcurgere != n);
        return theLast;
    }

}
