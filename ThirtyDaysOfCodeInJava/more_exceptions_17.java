/*
More Exceptions Day 17 - https://www.hackerrank.com/challenges/30-more-exceptions?h_r=next-challenge&h_v=zen

Task -
Write a Calculator class with a single method: int power(int,int). The power
method takes two integers as parameters and returns the integer result. If either integers is negative, then the method must throw an exception with
the message: "n and p should be non-negative." */

public class Calculator{
    public int power(int n, int p) throws Exception{
            if(n < 0 || p < 0){
                throw new Exception("n and p should be non-negative");
            }
        return (int)Math.pow(n,p);
    }
}