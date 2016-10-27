/*
Conditional Statements - https://www.hackerrank.com/challenges/30-conditional-statements?h_r=next-challenge&h_v=zen
*/

/*
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
*/
class Main{
	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      int n = scan.nextInt(); 
	      scan.close();
	       
	      checkInteger(n);

	   }
	  
		public static void checkInteger(int n){
			String ans ="Weird";
			
	        if(n % 2 != 0){
	            
	        }else if(2 <= n && n <= 5)
				ans = "Not Weird";
			else if(n > 20)
				ans = "Not Weird";

			System.out.println(ans);
		}
}