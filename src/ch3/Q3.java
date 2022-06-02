package ch3;

public class Q3
{
	private class Screen
	{
		private final int width;
		private final int height;


		public Screen(int width, int height)
		{
			this.height = height;
			this.width = width;
		}


		/**
		 * Calculate the number of pixels the screen contains.
		 *
		 * @return
		 */
		public int numberOfPixels()
		{
			return width * height;
		}


		/**
		 * Clear the screen
		 *
		 * @param shouldClear
		 */
		public void clear(boolean shouldClear)
		{
		}
	}

	public class Tester
	{
		public void test(int w, int h)
		{
			// Declare a new instance of Screen class.
			Screen sc = new Screen(w, h);

			/*
			Print out the number of pixels
				public int numberOfPixels() { return width * height; }
			*/
			System.out.println(sc.numberOfPixels());

			/* I used a ternary operator to choose the correct resolution to display */
			System.out.println(sc.numberOfPixels() >= 1e6 ? "high res" : "low res");

			/* This way should also work */
			/*
			if (sc.numberOfPixels() >= 1e6) {
				System.out.println("high res");
			}
			else {
				System.out.println("low res");
			}
			*/

			/* Just call the clear method with the correct argument */
			sc.clear(false);
			sc.clear(true);
		}
	}
}