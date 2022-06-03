package pp2015;

public class Q1Clock
{
	private static final int HOURS_PER_DAY = 24;
	private static final int MINS_PER_HOUR = 60;
	private static final int SECS_PER_MIN = 60;
	private int sec;
	private int min;
	private int hour;


	public Q1Clock(int h, int m, int s)
	{
		if(timeOkay(h, m, s)) {
			hour = h;
			min = m;
			sec = s;
		}
		else {
			hour = 0;
			min = 0;
			sec = 0;
		}
	}


	private boolean timeOkay(int hour, int min, int sec)
	{
		if(hour < 0 || min < 0 || sec < 0) {
			return false;
		}
		return hour < HOURS_PER_DAY && min < MINS_PER_HOUR && sec < SECS_PER_MIN;
	}


	@Override
	public String toString()
	{
		return String.format("%d:%d:%d", hour, min, sec);
	}


	public void increment()
	{
		sec++;
		if(sec >= SECS_PER_MIN) {
			sec -= SECS_PER_MIN;
			min++;
		}
		if(min >= MINS_PER_HOUR) {
			min -= MINS_PER_HOUR;
			hour++;
		}
		if(hour >= HOURS_PER_DAY) {
			hour -= HOURS_PER_DAY;
		}
	}


	public boolean equals(Q1Clock otherClock)
	{
		return toString().equals(otherClock.toString());
	}

}