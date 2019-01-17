/*
Your task is to find the nearest square number, nearest_sq(n),
of a positive integer n.

Goodluck :)

Check my other katas:

Alphabetically ordered

Case-sensitive!

Not prime numbers
 */
package kyu8;

/**
 *
 * @author User
 */
public class FindNearestSquareNumber {

    public static void main(String[] args) {

        int n = 10;
        int rez = 0;
        if ((n == 1) || (n == 2)) {
            rez = 1;
        } else {
            int r = (int) Math.sqrt(n);
            System.out.println("r = " + r);
            System.out.println("r+1 = " + (r+1));
            
            //rez = r*r;
            rez = (n - r*r) < ((r+1)*(r+1) - n) ? r*r : (r+1)*(r+1);
        }

        System.out.println("Numarul: " + n + " , are cel mai apropiat patrat: " + rez);
    }

}
