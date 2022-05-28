package ch4;

import java.util.ArrayList;

public class Q2
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
		public boolean checkIndex(int index)
		{
			return (index >= 0 && index < library.size());
		}
	}
}