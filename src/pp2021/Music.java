package pp2021;

public class Music
{
	private String title;
	private String composer;
	private int performanceTime;


	public Music(String title, String composer, int performanceTime)
	{
		this.title = title;
		this.composer = composer;
		this.performanceTime = performanceTime;
	}


	public String getTitle()
	{
		return title;
	}


	public String getComposer()
	{
		return composer;
	}


	public int getPerformanceTime()
	{
		return performanceTime;
	}


}