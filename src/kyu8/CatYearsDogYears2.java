/*
This is related to my other Kata about cats and dogs.
Kata Task

I have a cat and a dog which I got as kitten / puppy.

I forget when that was, but I do know their current ages as catYears and dogYears.

Find how long I have owned each of my pets and return as a list [ownedCat, ownedDog]

NOTES:

    Results are truncated whole numbers of "human" years

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
 * @author iucosoft9
 */
public class CatYearsDogYears2 {

    public static void main(String[] args) {

        int[] resultat = ownedCatAndDog(43, 19);

        System.out.println(" " + resultat[0] + " " + resultat[1]);
    }

    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {

        int cat = 0;
        int dog = 0;

        if (catYears < 1 || dogYears < 1) {
            return new int[]{0, 0};
        } else {

            if (catYears < 15) {
                cat = 0;
            } else {
                if ((15 <= catYears) && (catYears < 24)) {
                    cat = 1;
                } else {
                    cat = 2;
                    for (int i = catYears - 24; i >= 4; i -= 4) {
                        cat++;
                    }

                }
            }

            if (dogYears < 15) {
                dog = 0;
            } else {
                if ((15 <= dogYears) && (dogYears < 24)) {
                    dog = 1;
                } else {
                    dog = 2;
                    for (int i = dogYears - 24; i >= 5; i -= 5) {
                        dog++;
                    }

                }
            }

        }
        return new int[]{cat, dog};
    }
}
