/*
##Do you know how to write a recursive function? Let's test it!
Definition: Recursive function is a function that calls itself during its execution

Classic factorial counting on Javascript
function factorial(n) {
  return n <= 1 ? 1 : n * factorial(n-1) 
}
Your objective is to complete a recursive function reverse() that receives str as String and returns the same string in reverse order

Rules:

reverse function should be executed only N times. N = length of the input string
helper functions are not allowed
changing the signature of the function is not allowed
Examples:

reverse("hello world") = "dlrow olleh" (N = 11)
reverse("abcd") = "dcba" (N = 4)
reverse("12345") = "54321" (N = 5)
All tests for this Kata are randomly generated, besides checking the reverse 
logic they will count how many times the reverse() function has been executed.
 */
package kyu7;

/**
 *
 * @author User
 */
public class RecursiveReverseString {
    
    public static void main(String[] args) {
        System.out.println(reverse("buna ziua"));
    }
    
    public static String reverse(String str) {      
       return revers2(str.substring(1))+ str.charAt(0);
    }
    
    public static String revers2(String str2) {
     if((null == str2) || (str2.length() <= 1)) {
           return str2;
     }
     return str2;
    }

}


//char[] sir = str.toCharArray();
//    String reverse = "";
//    for(int i = str.length()- 1; i >=0; i--) {
//        reverse +=sir[i];
//    }
//    return reverse;
