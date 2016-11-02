/*Recursion Day 9 - https://www.hackerrank.com/challenges/30-recursion/submissions/code/31545190

 Write a factorial function that takes a positive integer,  as a parameter
and prints the result of  ( factorial).*/

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }
    
    public static int factorial(int n){
        if(n > 1){
            return n * factorial(n-1);            
        }
        return 1;
    }