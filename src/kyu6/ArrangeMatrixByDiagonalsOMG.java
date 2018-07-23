/*
You will be given a 2d char array data.

The task is to rearrange the elements in the SAME order, diagonally, like this:

    c h a         c a c 
    r a c   ==>   h a e
    t e r         r t r
here's another example

    j a v a         j v o t 
    c o d e    ==>  a c e c
    t a c o         a d a o 
another one!

    T h i s A r r a y       T i r y s r Y s y
    i S s O c r a z Y  ==>  h A a S c z t L a
    I t s R l y B a d       s r i O a I R B d
In other words, consider the order in which you read books (from left to right then down a line).

Take the characters in that order, and place them back in so that you can read them diagonally.

The diagonals run from bottom left to top right.

The first diagonal starts at element[0][0].

Note:
the ascii value of chars is does not affect the ordering.

All array dimensions will be greater than 0.
 */
package kyu6;

/**
 *
 * @author User
 */
public class ArrangeMatrixByDiagonalsOMG {

    public static void main(String[] args) {

        char[][] data = {
            {'1', '2', '3'},
            {'4', '5', '6'}
        };

        System.out.println("\ninitial : ");
        afisez(data);

        char[][] results = diagonalSort(data);

        System.out.println("\nrezultatul : ");
        afisez(results);
    }

    public static char[][] diagonalSort(char[][] data) {
        acest kata inca trebuie de papat :) 
        
        char[][] matrix = new char[data.length][data[0].length];

        String text = "";
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                text += data[i][j];
            }

        }
        char[] items = text.toCharArray();

        System.out.println("\ntext = " + text);
        int length = items.length;
        int width = matrix.length;
        int height = matrix[0].length;
        int lastRow = height - 1;

        int a = 0;
        int b = 0;
        int A = 0;
        int B = 0;
        boolean firstColumn = true;

        System.out.println("width = " + matrix.length);
        System.out.println("height = " + matrix[0].length);
        
        for (int i = 0; i < length; i++) {
            System.out.println("[" + a + "," + b + "] = " + items[i]);
            matrix[a][b] = items[i];
            if (a == height - 1) {
                firstColumn = false;
            }
            a--;
            b++;
            if (firstColumn) {
                if (a < 0) {
                    b = 0;
                    A++;
                    a = A;
                }
            } else {
                if ((b == width) || ((b == width - 1) && (a < 0))) {
                    B++;
                    b = B;
                    a = height - 1;
                }
            }
        }

        return matrix;
    }

    private static void afisez(char[][] matrix) {
        System.out.println("Afisez rezultatul: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
