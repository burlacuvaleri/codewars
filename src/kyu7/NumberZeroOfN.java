package kyu7;

/**
 *
 * @author iucosoft9
 */
public class NumberZeroOfN {

    public static void main(String[] args) {
        System.out.println(zeros(12));
        System.out.println(zeros(14));
        System.out.println(zeros(6));
        System.out.println(zeros(7));
        System.out.println(zeros(30));
    }

    public static int zeros(int n) {

        if (n == 0) {
            return 0;
        } else {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            boolean isZero = true;
            int nrZero = 0;
            System.out.println("Factorial " + n + " = " + factorial);
            do {
                if (factorial % 10 == 0) {
                    nrZero++;
                    factorial = factorial / 10;
                } else {
                    isZero = false;
                }
            } while (isZero);

            return nrZero;
        }
    }

}
