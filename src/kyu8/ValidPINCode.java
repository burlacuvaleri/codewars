package kyu8;


import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import java.io.IOException;
import static java.lang.Integer.parseInt;

/**
 *
 * @author iucosoft9
 */
public class ValidPINCode {
    
    
    public static void main(String[] args) {
        boolean valid = true;
        String pin = "01234546549";                
        int[] guess = new int[pin.length()];
        
        for (int i = 0; i < guess.length; i++) {
            guess[i] = pin.charAt(i);
            System.out.println("guess [" + i + "] = " + guess[i]);
            
            if (guess[i]>57 || guess[i]<48) {
                valid = false;
            }
        }
        System.out.println(valid);
        
    }
    
  
            
}
