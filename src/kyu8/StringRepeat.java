/*
Write a function called repeatStr which repeats the given string string 
exactly n times.

repeatStr(6, "I") // "IIIIII"
repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"
 */
package kyu8;

/**
 * assertEquals("aaaa", Solution.repeatStr(4, "a"));
 * assertEquals("HelloHelloHello", Solution.repeatStr(3, "Hello"));
 * assertEquals("", Solution.repeatStr(0, "kata")); assertEquals("",
 * Solution.repeatStr(-10, "kata"))
 */
public class StringRepeat {

    public static void main(String[] args) {
        System.out.println(repeatStr(4, "a"));
        System.out.println(repeatStr(3, "Hello"));
        System.out.println(repeatStr(0, "kata"));
        System.out.println(repeatStr(-10, "kata"));

    }

    public static String repeatStr(final int repeat, final String string) {
        if (repeat <=0) return "";
        StringBuilder sb = new StringBuilder(string);
        for (int i = 1; i < repeat; i++) {
            sb.append(string);
        }
        return sb.toString();
        
        //varianta 2
        //return java.util.stream.IntStream.range(0, repeat).mapToObj(i -> string).collect(java.util.stream.Collectors.joining()).toString();
    
        //varianta 3
        //return repeat < 0 ? "" : String.join("", Collections.nCopies(repeat, string));
        
        //varianta 4
        //return new String(new char[repeat]).replace("\0", string);
    }
}
