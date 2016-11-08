 /* 
Binary Numbers Day 10 - https://www.hackerrank.com/challenges/30-binary-numbers

 Given a base-10 integer,n, convert it to binary (base-2). Then find and print
the base-10 integer denoting the maximum number of consecutive 1's in n's binary
representation.  */


 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(getConsecutiveOnes(n));
    }
    
    public static int getConsecutiveOnes(int n){
        String binaryString = Integer.toBinaryString(n);
        int totalOnes = 0;
        int onesSoFar = 0;
        for(int i=0;i<binaryString.length();i++){
            if(binaryString.charAt(i)=='1'){
                onesSoFar++;
                if(onesSoFar > totalOnes){
                    totalOnes = onesSoFar;
                }
            }else{
                if(onesSoFar > totalOnes){
                    totalOnes = onesSoFar;
                    onesSoFar =0;
                }else{
                    onesSoFar =0;
                }
            }
        }
        return totalOnes;
    }