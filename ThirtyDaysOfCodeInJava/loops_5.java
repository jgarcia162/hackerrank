/*
Day 5 Loops - https://www.hackerrank.com/challenges/30-loops?h_r=next-challenge&h_v=zen

Given an integer, , print its first  multiples. Each multiple  (where ) should
be printed on a new line in the form: n x i = result.*/


 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printMultiples(n);
    }
    
    public static void printMultiples(int n){
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }