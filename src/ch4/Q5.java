package ch4;

public class Q5
{
	class Item
	{
		private final String name;


		public Item(String aName)
		{
			name = aName;
		}


		/**
		 * Add your method getName below this comment
		 */
		public String getName()
		{
			return name != null ? name : "Unknown";
		}
	}
}