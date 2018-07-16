/*
Write a function, persistence, that takes in a positive parameter num 
and returns its multiplicative persistence, which is the number of times 
you must multiply the digits in num until you reach a single digit.

For example:

 persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
                      // and 4 has only one digit

 persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
                       // 1*2*6 = 12, and finally 1*2 = 2

 persistence(4) == 0 // because 4 is already a one-digit number

 */
package kyu7;

/**
 *
 * @author iucosoft9
 */
public class PersistenceBugger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println(persistence(39));
        System.out.println(persistence(4));
//        System.out.println(persistence(25));
//        System.out.println(persistence(999));
        System.out.println(persistence(25));
//        System.out.println(persistence(3540));
//        System.out.println(persistence(398129));
//        System.out.println(persistence(97690));
        System.out.println(persistence(148998));

    }

    public static int persistence(long n) {
        //varianta de pe net
        long m = 1, r = n;

        if (r / 10 == 0) {
            return 0;
        }

        for (r = n; r != 0; r /= 10) {
            m *= r % 10;
        }

        return persistence(m) + 1;

        //varianta mea
//        int persistence = 1;
//        boolean again = true;
//        int contor = 0;
//        boolean isZero = false;
//
//        if (n < 10) {
//            return 0;
//        }
//        System.out.println("\n\n");
//        while (n >= 10) {
//            contor++;
//
//            //iau numarul si il inmultesc
//            System.out.println("Inmultesc cifrele nr: " + n);
//            do {               
//                if (n % 10 != 0) {
//                    persistence *= n % 10;
//                } else {
//                   isZero = true;
//                }
//                n = n / 10;
//                if (n > 0) {
//                    again = true;
//                } else {
//                    again = false;
//                }
//            } while (again);
//            System.out.println("Cifra inmultita este: " + persistence);
//            System.out.println("Contor: " + contor);
//
//            if(isZero != true){
//            n = persistence;
//            persistence = 1;
//            } else {
//                n = 0;
//            }
//        }
//        return contor;
    }
}
