/*
Kata Task

I have a cat and a dog.

I got them at the same time as kitten/puppy. That was humanYears years ago.

Return their respective ages now as [humanYears,catYears,dogYears]

NOTES:

    humanYears >= 1
    humanYears are whole numbers only

Cat Years

    15 cat years for first year
    +9 cat years for second year
    +4 cat years for each year after that

Dog Years

    15 dog years for first year
    +9 dog years for second year
    +5 dog years for each year after that

References

    http://www.catster.com/cats-101/calculate-cat-age-in-cat-years
    http://www.slate.com/articles/news_and_politics/explainer/2009/05/a_dogs_life.html

 */
package kyu8;

/**
 *
 * assertArrayEquals(new int[]{10,56,64},
 * Dinglemouse.humanYearsCatYearsDogYears(10));
 */
public class CatYearsDogYears {

    public static void main(String[] args) {

        int[] resultat = humanYearsCatYearsDogYears(10);

        System.out.println(" " + resultat[0] + " " + resultat[1] + " " + resultat[2]);

    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {

        int[] results = {0, 0, 0};
        results[0] = humanYears;

        if (humanYears < 1) {
            return new int[]{0, 0, 0};
        } else {
            results[1] = 15;
            results[2] = 15;

            for (int i = 2; i <= humanYears; i++) {
                if (i == 2) {
                    results[1] += 9;
                    results[2] += 9;
                } else {
                    results[1] += 4;
                    results[2] += 5;
                }
            }

        }

        return results;
    }

}
