/* 
Challenge Day 6 - https://www.hackerrank.com/challenges/30-review-loop?h_r=next-challenge&h_v=zen

Given a string, , of length  that is indexed from  to , print its even-
indexed and odd-indexed characters as  space-separated strings on a single
line */


public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        String n;
        for(int i = 0; i <= testCases; i++){
            n = scanner.next();
            printOddAndEvenCharacters(n);
        }
    }
    
    public static void printOddAndEvenCharacters(String n){
            String evenCharacters = "", oddCharacters = "";
        if(n.length() != 0){
            evenCharacters = n.charAt(0)+"";     
        }
        for(int i = 1; i < n.length(); i++){
            if(i % 2 == 0)
                evenCharacters += n.charAt(i);
            else
                oddCharacters += n.charAt(i);
            
        }
        System.out.println(evenCharacters + " " + oddCharacters);
    }