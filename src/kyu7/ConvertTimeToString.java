/*
Given time in seconds, return formatted string, as shown in following example:

####Example: Input: 90061 sec

Output: 1 1 1 1

e.g

90061 sec: 1 1 1 1 (1 day, 1 hour, 1 min and 1 seconds)
93784 sec: 1 2 3 4 (1 day, 2 hours, 3 mins, 4 seconds)
####Useful conversions:

60 sec = 1 min
60 min = 1 hour
24 hour = 1 day
Please see included test case for an example.
 */
package kyu7;

/**
 *
 * assertEquals("1 1 1 1", TimeUtils.convertTime(90061)); assertEquals("-1 -1 -1
 * -1", TimeUtils.convertTime(-90061));
 */
public class ConvertTimeToString {

    public static void main(String[] args) {
        System.out.println(convertTime(90061));

        System.out.println("90061 % 86400 : " + 90061 % 86400);
        System.out.println("90061 / 86400 : " + 90061 / 86400);
    }

    /*
    1 min = 60 sec
    1 h = 3600 sec
    1 zi = 86400 sec
    
    
     */

    public static String convertTime(int timeDiff) {
        int zi = timeDiff / 86400;
        timeDiff %= 86400;
        int h = timeDiff / 3600;
        timeDiff %= 3600;
        int min = timeDiff / 60;
        int sec = timeDiff % 60;

        return zi + " " + h + " " + min + " " + sec;
 
    }

}
