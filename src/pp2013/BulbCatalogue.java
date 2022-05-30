package pp2013;

import java.util.HashMap;
import java.util.Map;

public class BulbCatalogue
{
	private final Map<Integer, String> catalogue;


	public BulbCatalogue()
	{
		catalogue = new HashMap<>();
	}


	public Map<Integer, String> getCatalogue()
	{
		return catalogue;
	}


	public void populateCatalogue()
	{
		catalogue.put(10, "Sparky");
		catalogue.put(200, "BrightGuy");
		catalogue.put(911, "Neverlast");
		catalogue.put(42, "Blinker");
	}


	public void updateCatalogue()
	{
		for(int model : catalogue.keySet()) {
			if(model < 100) {
				catalogue.put(model,
				              catalogue.get(model)
				                       .concat(" - economy"));
			}
		}
	}
}