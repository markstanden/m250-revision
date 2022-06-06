package pp2018;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class WalkDiary
{
	private final Map<String, List<String>> walks;


	public WalkDiary()
	{
		walks = new TreeMap<>();
	}


	public void addWalk(String date, List<String> places)
	{
		walks.put(date, places);
	}


	public Map<String, List<String>> getWalks()
	{
		return new TreeMap<>(walks);
	}

}