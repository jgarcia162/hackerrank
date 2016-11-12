/* Scope Day 14 - https://www.hackerrank.com/challenges/30-scope?h_r=next-challenge&h_v=zen
Complete the Difference class by writing the following:

A class constructor that takes an array of integers as a parameter and saves
it to the  instance variable. A computeDifference method that finds the
maximum absolute difference between any  numbers in and stores it in the
maximumDifference instance variable. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

    public Difference(int[] elements){
        this.elements = elements;
    }

    public void computeDifference(){
        Arrays.sort(elements);
        maximumDifference = elements[elements.length-1] - elements[0];
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
