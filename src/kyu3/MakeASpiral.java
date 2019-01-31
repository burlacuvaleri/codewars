/*
Kata: Make a spiral

Your task, is to create a NxN spiral with a given size.

For example, spiral with size 5 should look like this:

00000
....0
000.0
0...0
00000

and with the size 10:

0000000000
.........0
00000000.0
0......0.0
0.0000.0.0
0.0..0.0.0
0.0....0.0
0.000000.0
0........0
0000000000

Return value should contain array of arrays, of 0 and 1, for example for given size 5 result should be:

[[1,1,1,1,1],[0,0,0,0,1],[1,1,1,0,1],[1,0,0,0,1],[1,1,1,1,1]]

Because of the edge-cases for tiny spirals, the size will be at least 5.

General rule-of-a-thumb is, that the snake made with '1' cannot touch to itself.

 */
package kyu3;

public class MakeASpiral {

    public static void main(String[] args) {

        int[][] exampleSpiral;
        // calculate spiral from 1 to 101 for example :)
        for (int p = 1; p < 101; p++) {

            exampleSpiral = calculateMySpiral(p);

            for (int i = 0; i < p; i++) {
                for (int j = 0; j < p; j++) {
                    System.out.print(" " + exampleSpiral[i][j]);
                }
                System.out.println("");
            }

            System.out.println("\n-----------------------------------------\n");
        }

    }

    private static int[][] calculateMySpiral(int size) {

        int[][] mySpiral = new int[size][size];
        
        // initialize the table with 0 (zero)
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mySpiral[i][j] = 0;
            }
        }

        int zero = 0;
        int a = 0;
        int b = size - 1;
        int c = size - 1;
        int d = 0;
        boolean makeSpiral;

        finish:
        do {
            // if not make a spiral this boolean will exit from do-while
            makeSpiral = false;
            
            // for example if i have 5x5
            // a...b
            // .....
            // .....
            // .....
            // d...c
            
            // make the line a -> b
            for (int j = zero; j <= b; j++) {
                mySpiral[a][j] = 1;
                makeSpiral = true;
            }

            // make the line b -> c
            for (int i = a + 1; i <= b; i++) {
                mySpiral[i][b] = 1;
                makeSpiral = true;
            }

            // make the line c -> d
            for (int k = c - 1; k > zero; k--) {
                mySpiral[c][k] = 1;
                makeSpiral = true;
            }

            // make the line d -> a
            for (int l = c; l > a + 1; l--) {
                mySpiral[l][d] = 1;
                makeSpiral = true;
            }

            a = a + 2;
            b = b - 2;
            c = c - 2;
            zero = d + 1;
            d = d + 2;

        } while (makeSpiral);

        return mySpiral;
    }

}
