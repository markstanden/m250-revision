package specimen;

import specimen.OU.Music;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Q8
{

	//Scroll down to see the ConcertHall class below the Concert class

	/**
	 * The class Concert models a musical event at a concert hall.
	 * Complete the class according to the instructions in part (a)
	 */
	class Concert implements Comparable<Concert>
	{
		private String concertName;
		private String date; // in "yyyy-mm-dd" format
		public static final int MAX_LENGTH = 120;

		private List<Music> programme;


		public Concert(String aDate, String aName)
		{
			date = aDate;
			concertName = aName;
			programme = new ArrayList<>();
		}


		/**
		 * Getter for the date of the concert.
		 */
		public String getDate()
		{
			return date;
		}


		/**
		 * Getter for the name of the concert.
		 */
		public String getConcertName()
		{
			return concertName;
		}


		/**
		 * A simple equals method.
		 */
		public boolean equals(Object o)
		{
			Concert c = (Concert) o;

			return date.equals(c.date) && concertName.equals(c.concertName);
		}


		/**
		 * Return a hash code for this concert based on its date and name.
		 */
		public int hashCode()
		{
			return date.hashCode() + concertName.hashCode();
		}


		public List<Music> getProgramme()
		{
			return programme;
		}


		public int getConcertLength()
		{
			int result = 0;
			for(Music performance : programme) {
				result += performance.getPerformanceTime();
			}
			return result;
		}


		public void addProgrammeItem(Music newPerformance)
		{
			if(newPerformance.getPerformanceTime() + getConcertLength() > MAX_LENGTH) {
				System.out.println("Running time exceeded");
			}
			else {
				programme.add(newPerformance);
			}
		}


		@Override
		public int compareTo(Concert concert)
		{
			return concertName.compareTo(concert.concertName);
		}
	}

	/**
	 * This class models a concert hall that hosts concerts of music.
	 * Complete this class using the instructions in part (b)
	 */
	class ConcertHall
	{
		// Add code for ConcertHall here
		public SortedMap<String, SortedSet<String>> whatsOn;


		public ConcertHall()
		{
			whatsOn = new TreeMap<>();
		}


		public void addConcert(Concert aConcert)
		{
			List<Music> programme = aConcert.getProgramme();
			for(Music event : programme) {
				String composer = event.getComposer();
				String title = event.getTitle();

				SortedSet<String> composerTitles = whatsOn.getOrDefault(composer, new TreeSet<>());

				composerTitles.add(title);
				whatsOn.put(composer, composerTitles);
			}
		}
	}
}