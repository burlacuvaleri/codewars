package kyu8;

/*
You receive some random elements as a space-delimited string. Check if the 
elements are part of an ascending sequence of integers starting with 1, with an increment of 1 (e.g. 1, 2, 3, 4).

Return:

    0 if the elements can form such a sequence, and no number is missing 
("not broken", e.g. "1 2 4 3")
    1 if there are any non-numeric elements in the input ("invalid", e.g. "1 2 a")
    n if the elements are part of such a sequence, but some numbers are missing, 
and n is the lowest of them ("broken", e.g. "1 2 4" or "1 5")

Examples

"1 2 3 4"  ==>  return 0, because the sequence is complete

"1 2 4 3"  ==>  return 0, because the sequence is complete (order doesn't matter)

"2 1 3 a"  ==>  return 1, because it contains a non numerical character

"1 3 2 5"  ==>  return 4, because 4 is missing from the sequence

"1 5"      ==>  return 2, because the sequence is missing 2, 3, 4 and 2 is the 
lowest

 */

public class BrokenSequence {

    public static void main(String[] args) {

        String sequence = "a1 2 100";
        if (sequence.length() == 0) {
            System.out.println("Range 0");
            System.exit(0);
        } else if (sequence.charAt(0) == 0){
        
        }
        
        String[] numbers = sequence.split(" ");

        for (String number : numbers) {
            System.out.print(" " + number);
        }
        System.out.println("\n");

        int guess = 0;
        for (int i = 0; i < sequence.length(); i++) {
            guess = sequence.charAt(i);
            if ((guess < 48 || guess > 57) && guess != 32) {
                System.out.println("Non digital number , return 1");
                System.exit(0);
            }              
        }
                
        
        int[] intNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            intNumbers[i] = Integer.parseInt(numbers[i]);            
        }  
       
        boolean ascending = false;
        do{
            int cash = 0;
            ascending = false;
            for (int i = 1; i < intNumbers.length; i++) {
                if(intNumbers[i] < intNumbers[i-1]) {
                    cash = intNumbers[i-1];
                    intNumbers[i-1] = intNumbers[i];
                    intNumbers[i] = cash;
                    ascending = true;
                }
            }    
            
        } while (ascending);
        
        for (int number : intNumbers) {
            System.out.println(" " + number);
        }
        
        for (int i = 0; i < intNumbers.length-1; i++) {
            if (intNumbers[i+1] != (intNumbers[i]+1)){
                System.out.println("Return [" + (intNumbers[i]+1) + "]");
            }
            
        }

        
    }

}



//public class BrokenSequence {
//		public int findMissingNumber(String sequence) {	    
//        int missing = 0;
//        
//        //check if is not empty
//        if (sequence.length() == 0) {
//            return missing;
//        } else if (sequence.charAt(0) == 32) {
//            missing =1;
//            return missing;
//        }
//        
//        //check if exist non numerical character
//        int guess = 0;
//        for (int i = 0; i < sequence.length(); i++) {
//            guess = sequence.charAt(i);
//            if ((i == 0) && (guess < 48 || guess > 57)) {
//                missing = 1;
//                return missing;
//            }
//            if ((guess < 48 || guess > 57) && guess != 32) {
//                missing = 1;
//                return missing;
//            }           
//        }
//        
//        // split the numbers
//        String[] numbers = sequence.split(" ");        
//        int[] intNumbers = new int[numbers.length];
//        for (int i = 0; i < numbers.length; i++) {
//            intNumbers[i] = Integer.parseInt(numbers[i]);            
//        }  
//       
//        //sortet ascending the numbers 
//        boolean ascending = false;
//        do{
//            int cash = 0;
//            ascending = false;
//            for (int i = 1; i < intNumbers.length; i++) {
//                if(intNumbers[i] < intNumbers[i-1]) {
//                    cash = intNumbers[i-1];
//                    intNumbers[i-1] = intNumbers[i];
//                    intNumbers[i] = cash;
//                    ascending = true;
//                }
//            }    
//            
//        } while (ascending);
//        
//        //check if is missing from the sequence
//        for (int i = 0; i < intNumbers.length-1; i++) {
//            if (intNumbers[i+1] != (intNumbers[i]+1)){
//                missing = intNumbers[i]+1;
//                return missing;
//            }
//            
//        }
//      return missing;
//    }    
//}