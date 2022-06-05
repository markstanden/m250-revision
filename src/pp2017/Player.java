package pp2017;

public class Player
{
	private int goals;


	private String name;


	public Player(String aName)
	{
		name = aName;
		goals = 0;
	}


	public int getGoals()
	{
		return goals;
	}


	public String getName()
	{
		return name;
	}


	public void setName(String aName)
	{
		name = aName;
	}


	public void incrementGoals()
	{
		goals++;
	}


	@Override
	public String toString()
	{
		return String.format("Player: %s has scored %d goals this season", name, goals);
	}
}