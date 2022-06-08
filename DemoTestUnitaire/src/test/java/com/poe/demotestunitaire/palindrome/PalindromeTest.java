/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.poe.demotestunitaire.palindrome;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Tom
 */
public class PalindromeTest {
    
    @Test    
    public void PalindromeTestWithARealPalindrome() {
        boolean result = Palindrome.isPalindrome("kayak");
        
        assertTrue(result);
    }
    
    @Test
    public void PalindromeTestWithNotAPalindrome() {
         boolean result = Palindrome.isPalindrome("bonjour");
         
         assertFalse(result);
    }
    
    @Test    
    public void PalindromeTestWithARealPalindromeV2() {
        boolean result = Palindrome.isPalindromeV2("Engage le jeu que je le gagne");
        
        
        assertTrue(result);
    }
    
    @Test
    public void PalindromeTestWithNotAPalindromeV2() {
         boolean result = Palindrome.isPalindromeV2("bonjour");
         
         assertFalse(result);
    }
    
    @Test
    public void PalindromeTestWithEmptyStringV2() {
         boolean result = Palindrome.isPalindromeV2("");
         
         assertTrue(result);
    }
    
    @Test    
    public void PalindromeTestWithAccents() {
        boolean result = Palindrome.isPalindromeV2("La mariée ira mal");
        
        
        assertTrue(result);
    }
    
}
