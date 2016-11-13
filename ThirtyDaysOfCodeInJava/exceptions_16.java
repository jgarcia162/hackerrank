/*Exceptions Day 16 - https://www.hackerrank.com/challenges/30-exceptions-string-to-integer?h_r=next-challenge&h_v=zen

Read a string and print its integer value; if it cannot be converted to an integer, print "Bad String".
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        getIntegerValue(S);
    }
    
    public static void getIntegerValue(String s){
        try{
            System.out.println(Integer.valueOf(s));
        }catch(Exception numberFormatException){
            System.out.println("Bad String");
        }
    }
}