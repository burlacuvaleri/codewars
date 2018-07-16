/*
Background

My TV remote control has arrow buttons and an OK button.

I can use these to move a "cursor" on a logical screen keyboard to type words...
Keyboard

The screen "keyboard" layout looks like this
a	b	c	d	e	1	2	3
f	g	h	i	j	4	5	6
k	l	m	n	o	7	8	9
p	q	r	s	t	.	@	0
u	v	w	x	y	z	_	/
Aa	SP						


    Aa is the SHIFT key. Pressing this key toggles alpha characters 
between UPPERCASE and lowercase
    SP is the space character
    The other blank keys in the bottom row have no function

Kata task

How many button presses on my remote are required to type the given words?
Notes

    The cursor always starts on the letter a (top left)

    The alpha characters are initially lowercase (as shown above)

    Remember to also press OK to "accept" each letter

    Take a direct route from one letter to the next

    The cursor does not wrap (e.g. you cannot leave one edge and reappear 
on the opposite edge)

    Although the blank keys have no function, you may navigate through 
them if you want to

    Spaces may occur anywhere in the words string.

    Do not press the SHIFT key until you need to. For example, with the 
word e.Z, the SHIFT change happens after the . is pressed (not before)

Example

words = Code Wars

    C => a-f-k-p-u-Aa-OK-U-P-K-F-A-B-C-OK = 14
    o => C-H-M-R-W-V-U-Aa-OK-SP-v-q-l-m-n-o-OK = 16
    d => o-j-e-d-OK = 4
    e => d-e-OK = 2
    space => e-d-c-b-g-l-q-v-SP-OK = 9
    W => SP-Aa-OK-SP-V-W-OK = 6
    a => W-V-U-Aa-OK-u-p-k-f-a-OK = 10
    r => a-f-k-p-q-r-OK = 6
    s => r-s-OK = 2

Answer = 14 + 16 + 4 + 2 + 9 + 6 + 10 + 6 + 2 = 69

Good Luck!
DM. 
 */
package kyu6;

/**
 *
 * @author iucosoft9
 */
public class TVRemoteShiftAndSpace {

    public static void main(String[] args) {

//           System.out.println(tvRemote("does"));
//           System.out.println(tvRemote("your"));
//           System.out.println(tvRemote("solution"));
//           
        System.out.println(tvRemote("CodeWars"));
    }

    public static int tvRemote(final String words) {
        Character[][] symbol = new Character[][]{
            {'a', 'b', 'c', 'd', 'e', '1', '2', '3'},
            {'f', 'g', 'h', 'i', 'j', '4', '5', '6'},
            {'k', 'l', 'm', 'n', 'o', '7', '8', '9'},
            {'p', 'q', 'r', 's', 't', '.', '@', '0'},
            {'u', 'v', 'w', 'x', 'y', 'z', '_', '/'},
            {'A', 'S'}};
        

        int[] pozitie = new int[2];
        pozitie[0] = 0;
        pozitie[1] = 0;
        int pas = 0;
        int totalPas = 0;
        boolean shift = false;
        boolean upper = false;
        boolean precedentaIsUpper = true;
        //System.out.println("l = " + pozitie[0] + " c = " + pozitie[1] + " totalPas = " + totalPas);

        for (int i = 0; i < words.length(); i++) {
            char caracter = words.charAt(i);

            for (int l = 0; l < symbol.length; l++) {
                for (int c = 0; c < symbol[l].length - 1; c++) {
                    if (Character.toUpperCase(caracter) == (Character.toUpperCase(symbol[l][c]))) {

                        if (caracter == symbol[l][c]) {
                            pas = 0;
                            if (isUpper(words.codePointAt(i - 1))) {
                                // precedenta a fost diferita + cod spre Aa
                                pas = (Math.abs(4 - pozitie[0]) + 1 + Math.abs(0 - pozitie[1]) + 1) + 1;
                                pozitie[0] = 4;
                                pozitie[1] = 0;
                                pas += Math.abs(l - pozitie[0]) + Math.abs(c - pozitie[1]) + 1;
                            } else {

                                pas += Math.abs(l - pozitie[0]) + Math.abs(c - pozitie[1]) + 1;
                            }

                            totalPas += pas;
                        } else {

                        }

//
//                        // 1) litera CURENTA e mare sau mica a fost precendenta mica/Mare circula prin 2 obtiuni
//                        shift = isUpper(words.codePointAt(i));
//                        if (i != 0) {
//                            precedentaIsUpper = isUpper(words.codePointAt(i - 1));
//                        }
//
//                        // 2) daca precedenta a fost mica/MARE (diferita) atunci rezolv prin 2 metode
//                        if (shift && precedentaIsUpper) {
//                            pas = 0;
//                            if (i == 0) {
//                                pas = (Math.abs(4-pozitie[0]) + 1 + Math.abs(0-pozitie[1]) + 1) + 1;
//                                pozitie[0] = 4;
//                                pozitie[1] = 0;
//                                //System.out.println("zzzzz l = " + pozitie[0] + " c = " + pozitie[1] + " totalPas = " + totalPas);
//                            }
//
//                            pas += Math.abs(l-pozitie[0]) + Math.abs(c-pozitie[1]) + 1;
//                            //System.out.println("pas = " + pas);
//                            totalPas += pas;
//                            pozitie[0] = l;
//                            pozitie[1] = c;
//                            System.out.println("CHAR: " + words.charAt(i)+ "     l = " + l + " c = " + c + " Pas = " + pas);
//                        } else if(!shift && !precedentaIsUpper){
//                            pas = 0;
//                            if (i == 0) {
//                                pas = (Math.abs(4-pozitie[0]) + 1 + Math.abs(0-pozitie[1]) + 1) + 1;
//                                pozitie[0] = 4;
//                                pozitie[1] = 0;
//                                //System.out.println("zzzzz l = " + pozitie[0] + " c = " + pozitie[1] + " totalPas = " + totalPas);
//                            }
//
//                            pas += Math.abs(l-pozitie[0]) + Math.abs(c-pozitie[1]) + 1;
//                            //System.out.println("pas = " + pas);
//                            totalPas += pas;
//                            pozitie[0] = l;
//                            pozitie[1] = c;
//                            System.out.println("CHAR: " + words.charAt(i)+ "     l = " + l + " c = " + c + " Pas = " + pas);
//
//                        }
                    }

                }

            }

//                        if (shift) {// daca e litera MARE         
//                            if (upper) {
//                                pas = l > pozitie[0] ? l - pozitie[0] : pozitie[0] - l;
//                                pas += c > pozitie[1] ? c - pozitie[1] : pozitie[1] - c;
//                                pas++;
//                                totalPas += pas;
//                            } else {
//                                pas = (4 - pozitie[0] + 1) + (pozitie[1] - 0 + 1) + (4 - l + 1) + (c + 1);
//                                pozitie[0] = l;
//                                pozitie[1] = c;
//                                upper = true;
//                                System.out.println(" Pas Shift = " + pas);
//                                totalPas += pas;
//                            }
//                        } else {// daca litera e mica
//
//                            if (upper) {
//                                pas = (4 - l + 1) + (c - 0 + 1) + (4 - l + 1) + (c + 1);
//                                pozitie[0] = l;
//                                pozitie[1] = c;
//                                upper = false;
//                            } else {
//
//                                pas = l > pozitie[0] ? l - pozitie[0] : pozitie[0] - l;
//                                pas += c > pozitie[1] ? c - pozitie[1] : pozitie[1] - c;
//                                pas++;
//                                totalPas += pas;
//                                System.out.println("Pas " + i + " = " + pas);
//
//                                pozitie[0] = l;
//                                pozitie[1] = c;
//                                break;
//                            }
//                        }
        }

        return totalPas;
    }

    private static boolean isUpper(int i) {
        return ((65 <= i) && (i <= 90)) ? true : false;
    }

}
