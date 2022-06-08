/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.poe.demotestunitaire.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author Tom
 */
public class CalculatorTest {
    
     
            
            
//    @Test   
//    public void testAdd() {
//        int result = Calculator.add(1, 2); 
//        
//        assertEquals(3, result);
//    }
//    
//    @Test   
//    public void testAdd3et2retourn5() {
//        int result = Calculator.add(3, 2); 
//        
//        assertEquals(5, result);
//    }
//    
//    @Test   
//    public void testAdd0et0retourn0() {
//        int result = Calculator.add(0, 0);
//        
//        assertEquals(0, result);
//    }
//    
//    @Test   
//    public void testAdd1et2retourn3ennegatif() {
//        int result = Calculator.add(-1, -2);
//        
//        assertEquals(-3, result);
//    }
//    
//    @Test   
//    public void testAddGrandsNombres() {
//        int result = Calculator.add(5000, 10000);
//        
//        assertTrue(result == 15000);
//    }
//    
//    @Test
//    public void testSubstract() {
//        assertEquals(2, Calculator.substract(2, 0));
//    }
//    
//    @Test 
//    public void testAssertSameBad() {
//        Calculator calculator1 = new Calculator();
//        Calculator calculator2 = new Calculator();
//        
//        assertSame(calculator1, calculator2);
//        
//    }
//    
//    @Test 
//    public void testAssertSameTrue() {
//        Calculator calculator1 = new Calculator();
//        Calculator calculator2 = new Calculator();
//        
//        calculator1 = calculator2;
//        
//        assertSame(calculator1, calculator2);
//        
//    }
    
//    @Test
//    public void testMaxBothPositive() {
//        int result = Calculator.max(5, 10);
//        
//        assertEquals(10, result);
//    }
//    
//    @Test
//    public void testMaxBothNegative() {
//        int result = Calculator.max(-5, -10);
//        
//        assertEquals(-5, result);
//    }
//    
//    @Test
//    public void testMaxOnePositiveOneNegative() {
//        int result = Calculator.max(5, -10);
//        
//        assertEquals(5, result);
//    }
//    
//     @Test
//    public void testMaxBothEquals() {
//        int result = Calculator.max(5, 5);
//        
//        assertEquals(5, result);
//    }
    
//    @Test
//    public void IntegerTest() {
//        Integer a = 5;
//        int b = 5;
//        
//        assertTrue(a == b);
//    }
    
    @Test
    public void testDivideBothEven() {
        float result = Calculator.divide(4, 2);
        
        assertEquals(2, result);
    }
    
    @Test
    public void testDivideBothOdd() {
        float result = Calculator.divide(3, 2);
        
        assertEquals(1.5, result);
    }
    
    @Test
    public void testDivideBothNegative() {
        float result = Calculator.divide(-3, -2);
        
        assertEquals(-3F/-2F, result);
    }
    
    @Test
    public void testDivideByZero() {
        float result = Calculator.divide(3, 0);
        
        assertEquals(Double.POSITIVE_INFINITY, result);       
        
    }
    
    @Test
    public void testDivideWithExceptionWithZeroAsDiviseur() {
         
        
        assertThrows(Exception.class, () -> {
            Calculator.divideWithException(10, 0);
        });      
     
    }
    
    @Test
    public void testGetOddNumbers() {
        ArrayList<Integer> result = Calculator.getOddNumbers(10);
        
        // Ce test en soi est suffisant, il est peu probable d'obtenir la bonne size avec de mauvaises valeurs
        assertEquals(5, result.size());
        
//        ArrayList<Integer> comparator = new ArrayList<>() {{
//            addAll(Arrays.asList(1,3,5,7,9));
//        }};        
//        
//        assertTrue(comparator.equals(result));

        assertTrue(result.containsAll(Arrays.asList(1,3,5,7,9)));
        
        boolean isGood = true;
        
        for (int i = 1; i < result.size(); i++) {
            if (i%2 == 0) {
                if (result.contains(i)) {
                    isGood = false;
                    break;
                }
            }
        }
        
        assertTrue(isGood);
       
    }
    
    @Test
    public void testGetOddNumbersWithOneMistake() {
        ArrayList<Integer> result = Calculator.getOddNumbers(10);
        
        ArrayList<Integer> comparator = new ArrayList<>() {{
            addAll(Arrays.asList(1,2,3,5,7,9));
        }};        
        
        assertFalse(comparator.equals(result));

    }
    
    @ParameterizedTest
    @CsvSource({"1,2,2","2,2,2","50,2,50","-1,-2,-1"})
    public void testMaxWithParams(int a, int b, int c) {
        assertEquals(c, Calculator.max(a, b));
    }
    
    @ParameterizedTest
    @CsvSource({"1","2","50","3"})
    public void testMaxWithOneParam(int a) {
        assertEquals(a, Calculator.max(a, 0));
    }
  
}
