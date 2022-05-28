package ch4;

import java.util.ArrayList;

public class Q3
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
		 * Add your listAllStrings method below this comment
		 */
		public void listAllStrings()
		{
			for(int i = 0; i < library.size(); i++) {
				System.out.printf("%d. %s\n", i + 1, library.get(i));
			}
		}
	}
}