
import java.util.Arrays;

/*
Now you are a doctor.

You are working with a patient's body which has many cells.

The patient's body is a matrix where every row represents a cell.

Each cell contains just uppercase and lowercase letters,

and every cell in the body should be the same.

Oh no! It seems that one of the cells have mutated!

It is your job to locate the mutation so that the chemo specialists can fix it!

return the location [i,j] within the matrix...

before it's too late! :(

example:

cellscellscellscodecodecells
cellscellscellscodecodecells
cellscellscellscodecodecells
cellscellscellscodecodecells
cellscellscellscodecodecells
cellscellscellscodecodecells
cellscellscellscodecodecells
cellscellscellscodecodecells
cellscellscellscodecodecells
cellscellscellscodecadecells <- here it is! [9, 20]
cellscellscellscodecodecells
cellscellscellscodecodecells
cellscellscellscodecodecells
cellscellscellscodecodecells
no bodies will have less than 3 cells.
if the diagnose was a false alarm, return an empty array.

 */
/**
 *
 * @author User
 */
public class CureCancer {

    public static void main(String[] args) {
        char[][] body = {
            "someGreaTstuffIthinkThisIs".toCharArray(),
            "someGreaTstuffIthinkThisIs".toCharArray(),
            "someGreaTstuffIthinkThisIs".toCharArray(),
            "someGreaTstuffIthinkThisIs".toCharArray(),
            "someGreaTstuffIthinkThisIs".toCharArray(),
            "someGreaTstuffIthinkThisIs".toCharArray(),
            "someGreaTstuffIthinkThisIs".toCharArray(),
            "someGreaTstuffIthinkThisIs".toCharArray(),
            "someGreaTstuffIthinkThisIs".toCharArray(),
            "someGreaTstuff1thinkThisIs".toCharArray(),
            "someGreaTstuffIthinkThisIs".toCharArray(),
            "someGreaTstuffIthinkThisIs".toCharArray(),
            "someGreaTstuffIthinkThisIs".toCharArray(),
            "someGreaTstuffIthinkThisIs".toCharArray(),
            "someGreaTstuffIthinkThisIs".toCharArray(),
            "someGreaTstuffIthinkThisIs".toCharArray()
        };
        int[] result = mutationLocation(body);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }

    public static int[] mutationLocation(char[][] body) {
        int[] results = new int[2];

        for (int i = 0; i < body.length - 1; i++) {
            for (int j = 0; j < body[i].length; j++) {
                if (body[i][j] != body[i + 1][j]) {
                    
                    if (i == 0) {
                        if (body[i][j] != body[2][j]) {
                            results[0] = i;
                            results[1] = j;
                            return results;
                        }
                    }

                    results[0] = i + 1;
                    results[1] = j;
                    return results;
                }
            }
        }
        return new int[0];
    }
}
