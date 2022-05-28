package ch3;

public class Q4
{
	public class Item
	{
		private final String name;
		private final int price;


		public Item(String aName, int aPrice)
		{
			name = aName;
			price = aPrice;
		}


		/**
		 * Complete this method to return a string representation of this object
		 * including its name and price in parentheses
		 * required format -> "name (price)"
		 */
		public String toString()
		{
			return String.format("%s (%d)", name, price);
		}
	}
}