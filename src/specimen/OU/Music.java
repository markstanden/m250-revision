package specimen.OU;

/**
 * The class Music models an item of music in a concert, including
 * its title (e.g. "The Planets"), composer (e.g. "Gustav Holst")
 * and its performance time in minutes.
 *
 * @author M250 MT
 * @version 1.0
 */
public class Music
{
	private String title;
	private String composer;
	private int performanceTime;  // in minutes


	/**
	 * Constructor for a Music object allowing the user to
	 * set its title, composer and running time.
	 */
	public Music(String aTitle, String aComposer, int aTime)
	{
		title = aTitle;
		composer = aComposer;
		performanceTime = aTime;
	}

	//getters and setters


	public String getTitle()
	{
		return title;
	}


	public void setTitle(String aTitle)
	{
		title = aTitle;
	}


	public String getComposer()
	{
		return composer;
	}


	public void setComposer(String aComposer)
	{
		composer = aComposer;
	}


	public int getPerformanceTime()
	{
		return performanceTime;
	}


	public void setPerformanceTime(int aTime)
	{
		performanceTime = aTime;
	}


	public String toString()
	{
		return composer + " " + title;
	}
}