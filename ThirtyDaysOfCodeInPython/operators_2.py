import sys

# 	Operators - https://www.hackerrank.com/challenges/30-operators

#     Given the meal price (base cost of a meal), tip percent (the percentage of
# the meal price being added as tip), and tax percent (the percentage of the
# meal price being added as tax) for a meal, find and print the meal's total
# cost. 

      
#         // Write your calculation code here.
#         double totalCost = totalCostOfMeal(mealCost,tipPercent,taxPercent);
#         // cast the result of the rounding operation to an int and save it as totalCost 
#         int totalCostRounded = (int) Math.round(totalCost);
      
#         // Print your result
#         System.out.println("The total meal cost is "+String.valueOf(totalCostRounded)+" dollars.");
#     }
    
#     public static double totalCostOfMeal(double baseCost,int tip, int tax){
# 		return baseCost + ((baseCost*tip)/100) + ((baseCost*tax)/100);
# 	}

scan = sys.stdin
mealCost = float(scan.readline())
tipPercent = int(scan.readline())
taxPercent = int(scan.readline())

def totalCostOfMeal(baseCost,tip,tax):
	return baseCost+((baseCost*tip)/100) + ((baseCost*tax)/100)

totalCost = totalCostOfMeal(mealCost,tipPercent,taxPercent)
totalCostRounded = round(totalCost,2)
print "The total meal cost is "+str(totalCostRounded)+" dollars."


