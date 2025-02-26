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

    @Test
    void greatestCommonDivisor() {
        assertEquals(6, Utils.greatestCommonDivisor(18, 24));
        assertEquals(6, Utils.greatestCommonDivisor(24, 18));
        assertEquals(1, Utils.greatestCommonDivisor(11, 17));
        assertEquals(1, Utils.greatestCommonDivisor(17, 11));
        assertEquals(13, Utils.greatestCommonDivisor(13, 13));
        assertEquals(20, Utils.greatestCommonDivisor(20, 20));
    }

    @Test
    void leastCommonMultiple() {
        assertEquals(1, Utils.leastCommonMultiple(1, 1));
        assertEquals(7, Utils.leastCommonMultiple(1, 7));
        assertEquals(7, Utils.leastCommonMultiple(7, 1));
        assertEquals(10, Utils.leastCommonMultiple(2, 5));
        assertEquals(10, Utils.leastCommonMultiple(5, 2));
        assertEquals(10, Utils.leastCommonMultiple(2, 10));
        assertEquals(10, Utils.leastCommonMultiple(10, 2));
        assertEquals(10, Utils.leastCommonMultiple(5, 10));
        assertEquals(10, Utils.leastCommonMultiple(10, 5));
        assertEquals(20, Utils.leastCommonMultiple(4, 5));
        assertEquals(20, Utils.leastCommonMultiple(5, 4));
        assertEquals(20, Utils.leastCommonMultiple(4, 10));
        assertEquals(20, Utils.leastCommonMultiple(10, 4));
    }
}