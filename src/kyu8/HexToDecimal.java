/*
Complete the function which converts hex number (given as a string) to a decimal number.
 */
package kyu8;

/**
 *
 * // assertEquals("expected", "actual"); 
 * assertEquals(1, Kata.hexToDec("1"));
 * assertEquals(10, Kata.hexToDec("a")); 
 * assertEquals(16, Kata.hexToDec("10"));
 * assertEquals(255, Kata.hexToDec("FF")); 
 * assertEquals(-12, Kata.hexToDec("-C"));
 */
public class HexToDecimal {

    public static void main(String[] args) {
        System.out.println(hexToDec("1"));
        System.out.println(hexToDec("a"));
        System.out.println(hexToDec("10"));
        System.out.println(hexToDec("FF"));
        System.out.println(hexToDec("-C"));               

    }

    public static int hexToDec(final String hexString) {
        
        return Integer.parseInt(hexString.trim(),16);
    }

}
