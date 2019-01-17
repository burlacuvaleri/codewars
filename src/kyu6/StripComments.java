/*
Complete the solution so that it strips all text that follows any of a set 
of comment markers passed in. Any whitespace at the end of the line should 
also be stripped out.

Example:

Given an input string of:

apples, pears # and bananas
grapes
bananas !apples

The output expected would be:

apples, pears
grapes
bananas

The code would be called like so:

var result = solution("apples, pears # and bananas\ngrapes\nbananas !apples", ["#", "!"])
// result should == "apples, pears\ngrapes\nbananas"

 */
package kyu6;

public class StripComments {

    public static void main(String[] args) {
        //System.out.println(stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[]{"#", "!"}));
        //System.out.println(stripComments("a #b\nc\nd $e f g", new String[]{"#", "$"}));
        
        System.out.println(stripComments("apples, pears[\ngrapes\nbananas]",new String[] {"$", "]"}));

        //System.out.println(stripComments("[\n\n\n\n\ne\n\n\n\n]c\nb\n\nf\n\nf\n\nbb\n\na\n\nae...", new String[]{"[", "]"}));
        
        
    }

    private static String stripComments(String text, String[] commentSymbols) {
           String[] textArr = text.split("\n");  
        boolean existSimbol = true;
        int index = 0;
        String textOut = "";
        
        for (String textOne : textArr) {
            existSimbol = false;
            for (String charOne : commentSymbols) {
                if (textOne.contains(charOne)) {
                    index = textOne.indexOf(charOne);
                    existSimbol = true;
                    break;    
                }
            }
            if (existSimbol) {
                textOne = textOne.substring(0, index);                
            }
            
            if (textOut.length() > 1) {
                    textOut += "\n" + textOne;
                } else {
                    textOut += textOne;                    
                }
        }

        return textOut;    
    }

}
