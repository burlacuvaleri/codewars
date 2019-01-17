/*
Write a function that returns the total surface area and volume of a box as an array: [area, volume]. 
 */
package kyu8;

/**
 *
 * @author iucosoft9
 */
public class SurfaceAreaAndVolumeofABox {

    public static void main(String[] args) {
        int[] calc = getSize(1, 2, 3);
        for (int c: calc) {
            System.out.print(c + " ");
        }
    }

    public static int[] getSize(int w, int h, int d) {
        int[] results = new int[2];
        results[0] = 2 * (h * w) + 2 * (h * d) + 2 * (w * d);
        results[1] = w * h * d;

        return results;
    }
    // varianta 2
    // return new int[] {2*(w*h + h*d + d*w), w*h*d};
}
