package com.gmail.barcan.ion.projecteuler;

public class Utils {

    public static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        long limit = (long) Math.sqrt(n);
//        for (long i = 3; i <= limit; i += 2) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
        for (long k = 1; ; k++) {
            long p = 6 * k - 1;
            if (p > limit) {
                break;
            }
            if (n % p == 0) {
                return false;
            }
            if (p + 2 > limit) {
                break;
            }
            if (n % (p + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(long n) {
        if (n < 0) {
            n = Math.abs(n);
        }
        if (n < 10) {
            return true;
        }
        String s = Long.toString(n);
        for (int i = 0; i < (s.length() / 2); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
