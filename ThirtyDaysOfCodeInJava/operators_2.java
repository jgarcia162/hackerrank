
/*
	Operators - https://www.hackerrank.com/challenges/30-operators

    Given the meal price (base cost of a meal), tip percent (the percentage of
the meal price being added as tip), and tax percent (the percentage of the
meal price being added as tax) for a meal, find and print the meal's total
cost. */


class Operators{

	 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double totalCost = totalCostOfMeal(mealCost,tipPercent,taxPercent);
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCostRounded = (int) Math.round(totalCost);
      
        // Print your result
        System.out.println("The total meal cost is "+String.valueOf(totalCostRounded)+" dollars.");
    }
    
    public static double totalCostOfMeal(double baseCost,int tip, int tax){
		return baseCost + ((baseCost*tip)/100) + ((baseCost*tax)/100);
	}
}