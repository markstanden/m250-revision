package pp2014;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class BulbCatalogue_List
{
	private SortedMap<String, List<String>> bulbMap;


	public BulbCatalogue_List()
	{
		bulbMap = new TreeMap<>();
	}


	public void addBulbType(String bulbType)
	{
		bulbMap.putIfAbsent(bulbType, new ArrayList<>());
	}


	public void addVariety(String bulbType, String variety)
	{
		bulbMap.get(bulbType)
		       .add(variety);
	}


	public void removeVariety(String bulbType, String variety)
	{
		bulbMap.get(bulbType)
		       .remove(variety);
	}


	public void printVarieties(String bulbType)
	{
		System.out.printf("Our varieties of %s are:\n", bulbType);

		for(String variety : bulbMap.get(bulbType)) {
			System.out.println(variety);
		}
	}


	public void printCatalogue()
	{
		System.out.println("Catalogue:");
		for(String bulbType : bulbMap.keySet()) {
			// Blank line above each bulb type
			System.out.println();

			printVarieties(bulbType);
		}
	}
}