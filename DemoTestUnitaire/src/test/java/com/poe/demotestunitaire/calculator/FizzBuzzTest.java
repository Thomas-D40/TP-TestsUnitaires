/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.poe.demotestunitaire.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author Tom
 */
public class FizzBuzzTest {

    @ParameterizedTest
    @CsvSource({"5", "15", "25", "50"})
    public void testFizzBuzz(int a) {
        ArrayList<String> result = FizzBuzz.fizzBuzz(a);
        System.out.println(result);

        assertEquals(a, result.size());

        for (int i = 0; i < result.size(); i++) {
            if ((i + 1) % 15 == 0) {
                assertEquals("fizzbuzz", result.get(i));
            } else if ((i + 1) % 3 == 0) {
                assertEquals("fizz", result.get(i));
            } else if ((i + 1) % 5 == 0) {
                assertEquals("buzz", result.get(i));
            }

        }

    }

}
