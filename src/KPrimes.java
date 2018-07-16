
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
31, 37, 41, 43, 47, 53, 59,
61, 67, 71, 73, 79, 83, 89, 97.
 */
public class KPrimes {
    
    
    public static void main(String[] args) {
        
        int start = 1;
        int end = 50;
        int k = 2;
        int isPrim = 0;
        for (int i = start; i < end+1; i++) {
            isPrim = 0;
            
//            for (int j = 1; j < i; j++) {
//                if (i%j == 0) {
//                    isPrim ++;
//                }
//            }
//            System.out.println("i  = " + i);
            for (int j = 1; j < i-1; j++) {
                if (i%j == 0) {
                    isPrim ++;
//                    System.out.print(j + " ");
                }                
            }
            
//            System.out.println(" isPrim = " + isPrim);
//            System.out.println(" ");
            if (isPrim > 2) {
                System.out.println(i);
            }
            
        }
        
    }
}
