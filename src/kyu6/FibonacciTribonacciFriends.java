/*
If you have completed the Tribonacci sequence kata, you would know 
by now that mister Fibonacci has at least a bigger brother. If not, 
give it a quick look to get how things work.

Well, time to expand the family a little more: think of a Quadribonacci
starting with a signature of 4 elements and each following element is 
the sum of the 4 previous, a Pentabonacci (well Cinquebonacci would
probably sound a bit more italian, but it would also sound really 
awful) with a signature of 5 elements and each following element is
the sum of the 5 previous, and so on.

Well, guess what? You have to build a Xbonacci function that takes 
a signature of X elements - and remember each next element is the 
sum of the last X elements - and returns the first n elements of 
the so seeded sequence.

xbonacci {1,1,1,1} 10 = {1,1,1,1,4,7,13,25,49,94}
xbonacci {0,0,0,0,1} 10 = {0,0,0,0,1,1,2,4,8,16}
xbonacci {1,0,0,0,0,0,1} 10 = {1,0,0,0,0,0,1,2,3,6}
xbonacci {1,1} produces the Fibonacci sequence

 */
package kyu6;

public class FibonacciTribonacciFriends {

    public static void main(String[] args) {

//{0,1,1,2,3,5,8,13,21,34},xbonacci(new double []{0,1},10));
//{1,1,2,3,5,8,13,21,34,55}, xbonacci(new double []{1,1},10));
//{0,0,0,0,1,1,2,4,8,16}, xbonacci(new double []{0,0,0,0,1},10));    
//{1,0,0,0,0,0,1,2,3,6}, xbonacci(new double []{1,0,0,0,0,0,1},10));  
        
        //double[] r = xbonacci(new double[]{0,1},10);
        //double[] r = xbonacci(new double[]{1,1},10);
        //double[] r = xbonacci(new double[]{0,0,0,0,1},10);
        //double[] r = xbonacci(new double[]{1,0,0,0,0,0,1},10);
        //double[] r = xbonacci(new double[]{11.0, 3.0, 19.0, 3.0, 17.0, 18.0, 13.0, 17.0, 16.0, 9.0, 15.0, 11.0}, 25);
        //double[] r = xbonacci(new double[]{3.0, 19.0, 12.0, 6.0, 3.0, 1.0, 17.0, 1.0, 7.0, 0.0, 11.0, 16.0, 17.0, 8.0, 7.0}, 15);
        //double[] r = xbonacci(new double[]{12.0, 14.0, 1.0, 14.0, 20.0, 15.0, 3.0, 13.0, 16.0, 5.0, 1.0, 15.0, 12.0, 18.0, 10.0, 19.0, 0.0, 12.0}, 68);
        //double[] r = xbonacci(new double[]{3.0, 13.0, 15.0}, 3);
        double[] r = xbonacci(new double[]{5.0, 1.0, 18.0, 9.0, 13.0, 6.0}, 10);

        for (double d : r) {
            System.out.print(" [" + d + "] \n");
        }
        System.out.println("\n");

    }

    //xbonacci {1,0,0,0,0,0,1} 10 = {1,0,0,0,0,0,1,2,3,6} 
    public static double[] xbonacci(double[] signature, int n) {

        if (n < 10) {
            return new double[]{};
        } else {
            if (signature.length >= n) {
                return signature;
            }
        }

        double[] results = new double[n];

        if (signature.length == 2) {
            int cicle = 2;
            double a = signature[0];
            double b = signature[1];
            results[0] = a;
            results[1] = b;
           
            do {
                results[cicle] = a + b;
                a = b;
                b = results[cicle];
                cicle++;
            } while (cicle < n);
            return results;
        }

          double sum = 0;
        int xFib = signature.length;
        for (int i = 0; i < xFib; i++) {
            sum += signature[i];
            results[i] = signature[i];
        }
        results[xFib] = sum;
        for (int i = xFib+1; i < n; i++) {
            sum = 0;
            for (int j = i-xFib; j < i; j++) {
                sum += results[j];
            }
            
            results[i] = sum;
        }

        return results;

    }

}
