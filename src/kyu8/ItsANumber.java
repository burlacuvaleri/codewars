/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kyu8;

/**
 *
 * @author iucosoft9
 */
public class ItsANumber {
    public static void main(String[] args) {
        
        String s = "s2.2324";

         try {
             double n = Double.parseDouble(s);
             System.out.println("true");
         
         } catch (Exception e){
             System.out.println("false");
         }        
        
    }
}
