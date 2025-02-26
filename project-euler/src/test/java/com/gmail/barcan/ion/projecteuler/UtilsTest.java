package com.gmail.barcan.ion.projecteuler;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void isPrime() {

        Set<Integer> knownPrimes = new HashSet<>(List.of(
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97));
        for (int i = 0; i <= 100; i++) {
            assertEquals(knownPrimes.contains(i), Utils.isPrime(i),
                    String.format("For %d : is knownPrime = %s, isPrime() = %s",
                            i, knownPrimes.contains(i), Utils.isPrime(i)));
        }
    }

    @Test
    void isPalindrome() {
        for (int i = 0; i < 10; i++) {
            assertTrue(Utils.isPalindrome(i));
        }
        for (int i = 11; i < 1000; i++) {
            String s = Integer.toString(i);
            assertEquals(s.charAt(0) == s.charAt(s.length() - 1), Utils.isPalindrome(i));
        }

        assertTrue(Utils.isPalindrome(1001));
        assertFalse(Utils.isPalindrome(1021));

        assertTrue(Utils.isPalindrome(21012));
        assertFalse(Utils.isPalindrome(21032));

    }

}