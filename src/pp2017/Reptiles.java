package pp2017;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Reptiles
{
	List<String> myLizards;


	public Reptiles()
	{
		myLizards = new LinkedList<>();
	}


	public int addLizard(String lizardName)
	{
		myLizards.add(lizardName);
		return myLizards.size();
	}


	public int howManySpecies()
	{
		return Set.of(myLizards)
		          .size();
	}


	public boolean doIHaveIt(String species)
	{
		return myLizards.contains(species);
	}


	public void update(String oldSpecies, int occurrance, String newSpecies)
	{
		int count = 0;
		for(int i = 0; i < myLizards.size(); i++) {
			if(myLizards.get(i)
			            .equals(oldSpecies)) {
				count++;
				if(count == occurrance) {
					myLizards.set(i, newSpecies);
				}
			}
		}
	}


	public void removeLizard(String thisSpecies, int occurrance)
	{
		update(thisSpecies, occurrance, "");
		myLizards.remove("");
	}
}