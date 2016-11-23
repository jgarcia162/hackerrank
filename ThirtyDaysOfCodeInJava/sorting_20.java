/* Sorting Day 20 - https://www.hackerrank.com/challenges/30-sorting?h_r=next-challenge&h_v=zen

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[scanner.nextInt()];
        int i = 0;
        while(scanner.hasNext()){
            a[i] = scanner.nextInt();
            i++;
        }
        int swaps = bubbleSort(a);
        System.out.println("Array is sorted in "+swaps+" swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);
    }
    public static int bubbleSort(int[] crunchifyArr) {
		int temp = 0,numSwaps = 0;
		for (int i = 0; i < crunchifyArr.length - 1; i++) {
 
			for (int j = 1; j < crunchifyArr.length - i; j++) {
				if (crunchifyArr[j - 1] > crunchifyArr[j]) {
					temp = crunchifyArr[j - 1];
					crunchifyArr[j - 1] = crunchifyArr[j];
					crunchifyArr[j] = temp;
                    numSwaps++;
				}
			}
		}
        return numSwaps;
	}
}