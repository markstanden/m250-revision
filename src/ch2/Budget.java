package ch2;

class Budget
{
	private final int budget; //the budget we can't exceed
	private int totalCost; //the cost of a purchase
	private int meanCost; //the mean cost of items per unit


	public Budget(int myBudget)
	{
		totalCost = 0;
		meanCost = 0;
		budget = myBudget;
	}


	/**
	 * setTotalCost finds the cost of a single purchase and
	 * stores the result in the the field called totalCost
	 */
	public void setTotalCost(int unitPrice, int quantity)
	{
		totalCost = unitPrice * quantity;
	}


	/**
	 * setMeanCost finds a per unit cost based on a total cost and a number of units.
	 * As it uses integer division, it calculates only an approximate mean cost
	 */
	public void setMeanCost(int totalCost, int units)
	{
		meanCost = totalCost / units;
	}


	/**
	 * printAffordability compares the parameter price with the budget
	 * and prints a message about whether the price is affordable for the budget, or not
	 */
	public void printAffordability(int price)
	{
		if(price > budget) {
			System.out.println("Too expensive");
		}
		else {
			System.out.println("Within budget");
		}
	}


	//These extra getter (accessor) methods are provided. You should not alter them.
	public int getTotalCost()
	{
		return totalCost;
	}


	public int getMeanCost()
	{
		return meanCost;
	}
}