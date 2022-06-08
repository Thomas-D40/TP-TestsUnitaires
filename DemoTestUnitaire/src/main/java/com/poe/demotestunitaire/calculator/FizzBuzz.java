/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poe.demotestunitaire.calculator;

import java.util.ArrayList;

/**
 *
 * @author Tom
 */
public class FizzBuzz {
    
    public static ArrayList<String> fizzBuzz(int max) {
        ArrayList<String> result = new ArrayList<>();
        String string = "";
        
        for (Integer i = 1; i <= max; i++) {
            if (i%3 == 0) {
                string += "fizz";
            }
            if (i%5 == 0) {
                string += "buzz";
            } 
            if (i%3 != 0 && i%5!= 0) {
                string = i.toString();
            }            
            result.add(string);
            string = "";
        }
        
        return result;     
       
        
    }
    
}
