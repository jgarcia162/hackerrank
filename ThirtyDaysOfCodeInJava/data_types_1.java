

/*Data Types Challenge - https://www.hackerrank.com/challenges/30-data-types

Declare  variables: one of type int, one of type double, and one of type String.
Read  lines of input from stdin and initialize your  variables.
Use the  operator to perform the following operations: 
Print the sum of  plus your int variable on a new line.
Print the sum of  plus your double variable to a scale of one decimal place on a new line.
Concatenate  with the string you read as input and print the result on a new line.*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
        
        DecimalFormat df
        
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "Java is ";
                
        Scanner scan = new Scanner(System.in);
        int x;
        double y;
        String z;

        x = scan.nextInt();
        y = scan.nextDouble();
        scan.nextLine();
        z = scan.nextLine();

        System.out.println(x + i);

        df = new DecimalFormat("#.#");

	System.out.println(df.format(d+y));

        System.out.println(s + z);
        
        scan.close();
    }
}