/*
 Create a function that takes a string and an integer (n).

The function should return a string that repeats the input string n number of times.

If anything other than a string is passed in you should return "Not a string"
Example

"Hi", 2 --> "HiHi"
1234, 5 --> "Not a string"

 */
package kyu8;

import com.sun.org.apache.bcel.internal.Constants;
import javafx.scene.control.ToolBar;

/**
 *
 * @author iucosoft9
 */
public class RepeatIt {

    public static void main(String[] args) {

        System.out.println(repeatString(24, 3));
        System.out.println(repeatString(true, 3));
        System.out.println(repeatString("243624", 22));
        System.out.println(repeatString(243624, 22));
    }

    public static String repeatString(final Object toRepeat, final int n) {
        
        if(n == 0) return "";
        StringBuilder sb = new StringBuilder(toRepeat.toString());      

        if ((toRepeat instanceof Integer) ||(toRepeat.getClass().isArray()) || toRepeat.toString().contentEquals("true")) {
            return "Not a string";
        } else {
            for (int i = 1; i < n; i++) {
                sb.append(toRepeat.toString());
            }
        }
        return sb.toString();
    }
}

