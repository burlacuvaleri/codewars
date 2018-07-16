package kyu8;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author iucosoft9
 */
public class NumarRomanInLitere {

    public static void main(String[] args) {

        System.out.println("solution");
        solution(2000);

    }

    private static void solution(int numar) {
        String numberRoman = "";
        String temp = Integer.toString(numar);
        int[] guess = new int[temp.length()];
        System.out.println("guess length = " + guess.length + 1);

        System.out.println("Temp = " + temp);
        
        //il pun intrun tabel
        for (int i = 0; i < guess.length; i++) {
            guess[i] = temp.charAt(i)-48;
            System.out.println("i = " + i + " = " + guess[i]);
        }
        
        //convertesc in ROMAN
        for (int i = 0; i < guess.length; i++) {
            switch (guess[i]) {

                case 1:
                    numberRoman += "I";
                    break;
                case 2:
                    numberRoman += "II";
                    break;
                case 3:
                    numberRoman += "III";
                    break;
                case 4:
                    numberRoman += "IV";
                    break;
                case 5:
                    numberRoman += "V";
                    break;
                case 6:
                    numberRoman += "VI";
                    break;
                case 7:
                    numberRoman += "VII";
                    break;
                case 8:
                    numberRoman += "VIII";
                    break;
                case 9:
                    numberRoman += "IX";
                    break;
            }
            numberRoman +=",";
        }

        System.out.println("numberRoman = " + numberRoman);

    }
}

//    private static class solution(int nrIntrodus) {
//
//            String number = "";
//    
//    switch(n){
//      case 1: number = "I"; break;
//      case 2: number = "II"; break;
//      case 3: number = "III"; break;
//      case 4: number = "IV"; break;
//      case 5: number = "V"; break;
//      case 6: number = "VI"; break;
//      case 7: number = "VII"; break;
//      case 8: number = "VIII"; break;
//      case 9: number = "IX"; break;
//      case 10: number = "X"; break;
//      case 50: number = "L"; break;
//      case 100: number = "C"; break;
//      case 500: number = "D"; break;
//      case 1000: number = "M"; break;
//      default: number = "Is not ROMAN numer!"; break;
//      
//      }
//        }
//        }

