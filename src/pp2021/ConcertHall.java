package pp2021;

import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class ConcertHall
{
	/** Q3-c-i */
	private SortedMap<String, SortedSet<String>> whatsOn;


	/** Q3-c-ii */
	public ConcertHall()
	{
		whatsOn = new TreeMap<>();
	}


	public void addConcert(Concert toAdd)
	{
		for(Music performance : toAdd.getProgramme()) {
			String composer = performance.getComposer();
			String title = performance.getTitle();

			SortedSet<String> composerTitles = whatsOn.getOrDefault(composer, new TreeSet<>());
			composerTitles.add(title);

			whatsOn.put(composer, composerTitles);
		}

	}
}