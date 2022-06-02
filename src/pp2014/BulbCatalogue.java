package pp2014;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class BulbCatalogue
{
	private SortedMap<String, Set<String>> bulbMap;


	public BulbCatalogue()
	{
		bulbMap = new TreeMap<>();
	}


	public void addBulbType(String bulbType)
	{
		bulbMap.putIfAbsent(bulbType, new HashSet<>());
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