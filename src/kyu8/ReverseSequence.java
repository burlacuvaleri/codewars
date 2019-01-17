package kyu8;

/**
 *
 * @author iucosoft9
 */
public class ReverseSequence {
    
    public static void main(String[] args) {
    
    int n = 6;    
    int[] reverse = new int[n];
    
    for(int i = 0; i < n; i++){
      reverse[i] = n-i;  
        System.out.println(" i = " + i + " reverse[i] = " + reverse[i]);
    }   

    
    }
    

}
