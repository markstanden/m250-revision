package pp2021;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Concert implements Comparable<Concert>
{
	public static final int MAX_LENGTH = 120;
	private String concertName;
	private String date;
	/** Q3-a-i */
	private List<Music> programme;


	/** Q3-a-ii */
	public Concert(String date, String concertName)
	{
		this.date = date;
		this.concertName = concertName;
		this.programme = new ArrayList<>();
	}


	public List<Music> getProgramme()
	{
		return List.copyOf(programme);
	}


	public String getConcertName()
	{
		return concertName;
	}


	public String getDate()
	{
		return date;
	}


	/** Q3-a-iii */
	public int getConcertLength()
	{
		return programme.stream()
		                .parallel()
		                .map(Music::getPerformanceTime)
		                .reduce(0, (acc, time) -> acc += time);
	}


	public void addProgrammeItem(Music musicalWork)
	{
		if((getConcertLength() + musicalWork.getPerformanceTime()) <= Concert.MAX_LENGTH) {
			programme.add(musicalWork);
		}
		else {
			System.out.println("Running time exceeded");
		}
	}


	@Override
	public boolean equals(Object obj)
	{
		if(! (obj instanceof Concert)) {
			return false;
		}

		Concert otherConcert = (Concert) obj;
		return getConcertName().equals(otherConcert.getConcertName());
	}


	@Override
	public int hashCode()
	{
		return Objects.hashCode(getConcertName());
	}


	@Override
	public int compareTo(Concert otherConcert)
	{
		return getConcertName().compareTo(otherConcert.getConcertName());
	}
}