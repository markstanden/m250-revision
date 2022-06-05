package ch12;

public class Q1
{
	public interface TimeKeeper
	{
		void reset();         // resets seconds to 0


		void addToSeconds();  // adds 0.01 seconds to seconds. Resets to zero if seconds >= 1 hour.


		String displayTime(); // returns the formatted time in minutes and seconds to 2 decimal places.
	}

	public class Watch implements TimeKeeper
	{
		private double seconds;


		public Watch(int seconds)
		{
			this.seconds = seconds;
		}


		@Override
		public void reset()
		{
			seconds = 0;
		}


		@Override
		public void addToSeconds()
		{
			final double HOUR_IN_SECONDS = 60 * 60;
			seconds += 0.01;
			if(seconds >= HOUR_IN_SECONDS) {
				seconds = 0;
			}
		}


		@Override
		public String displayTime()
		{
			int mins = (int) seconds / 60;
			double remainder = seconds % 60;
			return String.format("The timer says: %d minutes %.2f seconds", mins, remainder);
			//return String.format("The timer says: %1$tM minutes %1$tS seconds", (long) seconds * 1000);
		}
	}
}