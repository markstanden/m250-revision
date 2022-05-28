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
			Screen sc = new Screen(w, h);
			System.out.println(sc.numberOfPixels());
			System.out.println(sc.numberOfPixels() >= 1e6 ? "high res" : "low res");
			sc.clear(false);
			sc.clear(true);
		}
	}
}