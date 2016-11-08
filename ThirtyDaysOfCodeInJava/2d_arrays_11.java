 /* Challenge Day 11 2D Arrays - https://www.hackerrank.com/challenges/30-2d-arrays?h_r=next-challenge&h_v=zen

    Task 
    Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.
 */



 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(findMaximumHourglassSum(arr));
    }
    
    public static int findMaximumHourglassSum(int[][] array){
        int currentSum = 0;
        int maxSum = 0;
        for(int i=0; i<array.length-2;i++){
            for(int j=0;j<array.length-2;j++){
                currentSum = array[i][j]+array[i][j+1]+array[i][j+2]+array[i+1][j+1]+array[i+2][j]+array[i+2][j+1]+array[i+2][j+2];
                if(i == 0 && j == 0){
                    maxSum = currentSum;
                }
                if(currentSum>maxSum){
                    maxSum = currentSum;
                    currentSum=0;
                }else{
                    currentSum = 0;
                }
            }
        }
        return maxSum;
    }