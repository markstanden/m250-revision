package pp2018;

import java.util.ArrayList;
import java.util.List;

public class Walk
{
	private List<String> details;


	public Walk()
	{
		details = new ArrayList<>();
	}


	public Walk(String date, List<String> places)
	{
		this();
		details.add(date);
		details.addAll(places);
	}


	public int addPlace(String placeName)
	{
		details.add(placeName);
		return details.size() - 1;
	}


	public String whichPlace(int visitedNumber)
	{
		if(visitedNumber >= 1 && visitedNumber < details.size()) {
			return details.get(visitedNumber);
		}
		else {
			return "Invalid index";
		}
	}


	public int whichIndex(String place)
	{
		return details.indexOf(place);
	}


	public int removePlace(String place)
	{
		boolean success = details.remove(place);

		return success ? details.size() - 1 : - 1;
	}


	public boolean updateName(String oldPlaceName, String newPlaceName)
	{
		if(whichIndex(oldPlaceName) > 0) {
			// placename is present
			details.set(whichIndex(oldPlaceName), newPlaceName);
			return true;
		}
		return false;
	}


	public void printWalk()
	{
		String result = String.format("On %s the following places were visited:\n", details.get(0));

		for(int i = 1; i < details.size(); i++) {
			result += details.get(i) + "\n";
		}

		System.out.println(result);
	}
}