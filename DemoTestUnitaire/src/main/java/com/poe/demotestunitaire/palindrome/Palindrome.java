/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poe.demotestunitaire.palindrome;

import org.apache.commons.lang3.StringUtils;

import java.text.Normalizer;
import java.util.ArrayList;

/**
 *
 * @author Tom
 */
public class Palindrome {

    public static boolean isPalindrome(String wordToTest) {

        StringBuilder strb = new StringBuilder(wordToTest);
        String otherWay = strb.reverse().toString();

        if (otherWay.equals(wordToTest)) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isPalindromeV2(String wordToTest) {
        wordToTest = wordToTest.replaceAll(" ","");
        wordToTest = wordToTest.toLowerCase();
//        wordToTest = Normalizer.normalize(wordToTest, Normalizer.Form.NFD);
        wordToTest = StringUtils.stripAccents(wordToTest);
        
        
        int debut = 0;
        int fin = wordToTest.length() - 1;
        
        while (debut < fin) {
            if (wordToTest.charAt(debut) != wordToTest.charAt(fin)) {
                return false;
            }
            debut++;
            fin--;
        }
        return true;
    }

}
