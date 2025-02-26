package com.gmail.barcan.ion.projecteuler;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143?
 */
public class P0003_LargestPrimeFactor {

    public static void main(String[] args) {
        // System.out.println(largestPrimeFactor_solutionOne(13195));
        System.out.println(largestPrimeFactor_solutionOne(600851475143L));
    }

    static long largestPrimeFactor_solutionOne(long number) {
        long limit = (long) Math.sqrt(number);
        long current = number;
        long largestPrimeFactor = number;
        for (long i = 2; i <= limit; i++) {
            if (current == 1) {
                return largestPrimeFactor;
            }
            if (Utils.isPrime(i)) {
                while (current > 1 && current % i == 0) {
                    largestPrimeFactor = i;
                    current /= i;
                }
            }
        }
        return largestPrimeFactor;
    }

}
