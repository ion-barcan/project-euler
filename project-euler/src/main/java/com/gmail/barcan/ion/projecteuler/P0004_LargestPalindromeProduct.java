package com.gmail.barcan.ion.projecteuler;

public class P0004_LargestPalindromeProduct {

    public static void main(String[] args) {
        int MAX = 999;
        int largestPalindrome = 0;
        int p1 = 0;
        int p2 = 0;
        for (int i = MAX; i >= 100; i--) {
            if (i * i < largestPalindrome) {
                break;
            }
            for (int j = i; j >= 100; j--) {
                int p = i * j;
                if (Utils.isPalindrome(p)) {
                    if (p > largestPalindrome) {
                        largestPalindrome = p;
                        p1 = i;
                        p2 = j;
                    }
                    break;
                }
            }
        }
        if (largestPalindrome > 0) {
            System.out.printf("%d = %d * %d\n", largestPalindrome, p1, p2);
        } else {
            System.out.println("NO PALINDROME");
        }
    }

}
