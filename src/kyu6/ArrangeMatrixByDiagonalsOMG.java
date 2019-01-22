/*
Kata: Arrange Matrix by Diagonals -- OMG

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

public class ArrangeMatrixByDiagonalsOMG {

    public static void main(String[] args) {

        char[][] data = {
//            {'1', '2', '3'},
//            {'4', '5', '6'},
//            {'7', '8', '9'}
                
            {'j', 'a', 'v', 'a'},
            {'c', 'o', 'd', 'e'},
            {'t', 'a', 'c', 'o'}
        };

        System.out.println("\nInitial table: ");
        showTable(data);

        char[][] results = diagonalSort(data);

        System.out.println("\nFinally table : ");
        showTable(results);
    }

    public static char[][] diagonalSort(char[][] data) {

        char[][] matrix = new char[data.length][data[0].length];
        
        int nrOfCharacters = data.length * data[0].length;
        char[] caracters = new char[nrOfCharacters];

        int k = -1;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                k++;
                caracters[k] = data[i][j];
                
                // Set initial the table matrix with '*'
                matrix[i][j] = '*';
            }
        }
       
        int a = 0; // For my rows
        int v = 0; // For my characters

        do {
            for (int i = a; i >= 0; i--) {

                int j = 0;
                do {
                    if (matrix[i][j] == '*' ) {
                        matrix[i][j] = caracters[v];                        
                        v++;
                        j = matrix[i].length;                        
                    }

                    j++;
                } while (j < matrix[i].length);
            }

            if (a < data.length-1) {
                a++;
            }
        } while (v < caracters.length);
               
        
        return matrix;
    }

    private static void showTable(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
