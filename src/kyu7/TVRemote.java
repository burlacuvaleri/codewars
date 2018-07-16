/*
Background

My TV remote control has arrow buttons and an OK button.

I can use these to move a "cursor" on a logical screen keyboard to type words...

The screen "keyboard" layout looks like this
a	b	c	d	e	1	2	3
f	g	h	i	j	4	5	6
k	l	m	n	o	7	8	9
p	q	r	s	t	.	@	0
u	v	w	x	y	z	_	/
Kata task

How many button presses on my remote are required to type a given word?
Notes

    The cursor always starts on the letter a (top left)

    Remember to also press OK to "accept" each letter.

    Take a direct route from one letter to the next

    The cursor does not wrap (e.g. you cannot leave one edge and reappear on the opposite edge)

Example

word = codewars

    c => a-b-c-OK = 3
    o => c-d-e-j-o-OK = 5
    d => o-j-e-d-OK = 4
    e => d-e-OK = 2
    w => e-j-o-t-y-x-w-OK = 7
    a => w-r-m-h-c-b-a-OK = 7
    r => a-f-k-p-q-r-OK = 6
    s => r-s-OK = 2

Answer = 3 + 5 + 4 + 2 + 7 + 7 + 6 + 2 = 36

Good Luck!
DM.

 */
package kyu7;

/**
 *
 * @author iucosoft9
 */
public class TVRemote {

    public static void main(String[] args) {

        Character[][] symbol = new Character[][]{
            {'a', 'b', 'c', 'd', 'e', '1', '2', '3'},
            {'f', 'g', 'h', 'i', 'j', '4', '5', '6'},
            {'k', 'l', 'm', 'n', 'o', '7', '8', '9'},
            {'p', 'q', 'r', 's', 't', '.', '@', '0'},
            {'u', 'v', 'w', 'x', 'y', 'z', '_', '/'}};
 

        String word = "work";
        int[] pozitie = new int[2];
        pozitie[0] = 0;
        pozitie[1] = 0;
        int pas = 0;
        int totalPas = 0 ;
        
        for (int i = 0; i < word.length(); i++) {
            char caracter = word.charAt(i);

            for (int l = 0; l < symbol.length; l++) {
                for (int c = 0; c < symbol[l].length; c++) {
                    if (caracter == symbol[l][c]) {
                        System.out.println("Este ! : " + symbol[l][c] + " = pozitia [" + l + "," + c + "]");
                        
                        pas = l > pozitie[0] ? l-pozitie[0] : pozitie[0]-l;
                        pas += c > pozitie[1] ? c-pozitie[1] : pozitie[1]-c;
                        pas ++;
                        totalPas += pas;
                        System.out.println("Pas " + i + " = " + pas);
                        
                        pozitie[0] = l;
                        pozitie[1] = c;
                        break;
                    }
                 


                }
                
            }

        }
        
        System.out.println("Total Pas = " + totalPas);

    }

}
