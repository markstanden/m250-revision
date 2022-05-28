package ch4;

import java.util.ArrayList;

public class Q1
{
	class Example
	{
		private final ArrayList<String> library;


		public Example()
		{
			library = new ArrayList<>();
		}


		public void addElement(String el)
		{
			library.add(el);
		}


		/**
		 * Add your method checkIndex below this comment
		 */
		public void checkIndex(int index)
		{
			int maxValid = library.size() - 1;

			if(library.size() == 0) {
				System.out.println("The collection is empty!");
			}
			else if(index < 0 || index > maxValid) {
				System.out.println("The valid index range is 0 to " + maxValid);
			}
		}
	}
}