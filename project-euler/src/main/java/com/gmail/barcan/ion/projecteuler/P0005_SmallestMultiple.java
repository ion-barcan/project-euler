package com.gmail.barcan.ion.projecteuler;

import java.util.HashMap;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20 ?
 */
public class P0005_SmallestMultiple {

    public static void main(String[] args) {
        solutionOne();

        solutionTwo();
    }

    public static void solutionOne() {
        long solution = 2 * 2 * 2 * 2 *
                3 * 3 *
                5 *
                7 *
                11 *
                13 *
                17 *
                19;
        System.out.println("solution 1 = " + solution);

    }

    public static void solutionTwo() {
        long lcm = 2 * 3;
        for (long i = 4; i <= 20; i++) {
            lcm = Utils.leastCommonMultiple(lcm, i);
        }
        System.out.println("solution 2 = " + lcm);
    }



}
