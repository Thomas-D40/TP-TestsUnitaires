
package com.poe.demotestunitaire.calculator;

import java.util.ArrayList;

/**
 *
 * @author Tom
 */
public class Calculator {
    

    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int substract(int a, int b) {
        return a - b;
    }
    
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
    
    public static float divide(int dividende, int diviseur) throws ArithmeticException{
        try {
            return (float) dividende/diviseur;
        } catch (ArithmeticException e) {
            System.out.println("Division par zéro impossible");
            if (dividende >= 0) {
            return Float.POSITIVE_INFINITY;
            } else {
                return Float.NEGATIVE_INFINITY;
            }
        }
    }
    
    public static float divideWithException(int dividende, int diviseur) throws ArithmeticException {
        return dividende / diviseur;
    }
    
    public static ArrayList<Integer> getOddNumbers(int max) {
        var result = new ArrayList<Integer>();
        
        for (int i = 1; i <= max; i++) {
            if (i%2 == 1) {
                result.add(i);
            }
        }
        
        return result;
    }   
   
    
}
