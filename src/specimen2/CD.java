package specimen2;

class CD
{
	private String artist;
	private String title;
	private int minutes;

	public CD(String anArtist, String aTitle, int numMinutes)
	{
		artist = anArtist;
		title = aTitle;
		minutes = numMinutes;
	}

	public String toString()
	{
		return "Artist: " + artist + " Title: " + title
				       + " Playing time: " + minutes;
	}

	public void hours()
	{
		if (minutes < 60) {
			System.out.println("Less than one hour");
		}
		else {
			int hrs;
			hrs = minutes / 60;
			System.out.println("hours " + hrs);
		}
	}
}