/*
Given an array of 3 integers a, b and c, determine if they form a pythagorean triple.

A pythagorean triple is formed when:

c2 = a2 + b2
where c is the largest value of a, b, c.

For example: a = 3, b = 4, c = 5 forms a pythagorean triple, because 52 = 32 + 42

Return Values
1 if a, b and c form a pythagorean triple
0 if a, b and c do not form a pythagorean triple
For Python: return True or False
 */
package kyu8;

/**
 *
 * @author User
 */
public class PythagoreanTriple {
    public static void main(String[] args) {
        System.out.println(pythagoreanTriple(new int[]{3,4,5}));
//        System.out.println("2^3 = " + Math.pow(2, 3));
        
    }
    public static int pythagoreanTriple(int[] triple){
		
  return ((int)Math.pow(triple[2],2) == ((int)Math.pow(triple[0],2)+ (int)Math.pow(triple[1],2))) ? 1 : 0 ;  
	}

    
}
