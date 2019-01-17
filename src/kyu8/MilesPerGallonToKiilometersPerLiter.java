/*
 Sometimes, I want to quickly be able to convert miles per imperial 
gallon into kilometers per liter.

Create an application that will display the number of kilometers per
liter (output) based on the number of miles per imperial gallon (input).

Make sure to round off the result to two decimal points. If the answer
ends with a 0, it should be rounded off without the 0. So instead of 5.50,
we should get 5.5.

Some useful associations relevant to this kata:
1 Imperial Gallon = 4.54609188 litres 1 Mile = 1.609344 kilometres
 */
package kyu8;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * assertEquals(3.54f, Converter.mpgToKPM(10), 0.001f);
 * assertEquals(7.08f, Converter.mpgToKPM(20), 0.001f);
 * assertEquals(10.62f, Converter.mpgToKPM(30), 0.001f);
 * 
 */
public class MilesPerGallonToKiilometersPerLiter {
    
    
    
    public static void main(String[] args) {
        System.out.println(mpgToKPM(10f));
        System.out.println(mpgToKPM(20f));
        System.out.println(mpgToKPM(30f));
    }
    
        
    public static float mpgToKPM(final float mpg) {
        //varianta 1 
        return new BigDecimal(mpg/4.54609188f*1.609344f).setScale(2, RoundingMode.HALF_EVEN).floatValue();
            
        // varianta 2
        // return Float.parseFloat(String.format("%.2f", mpg * KILOMETER / LITER ));;
        
        // varianta 3
        // return (float)(Math.round(mpg * KPM / LPG * 100)) / 100;
  }
}
