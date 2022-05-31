package pp2014;

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

	public void addGoals(int additionalGoals){
		goals += additionalGoals;
	}


	public String getName()
	{
		return name;
	}


	public void setName(String aName)
	{
		name = aName;
	}


	@Override
	public String toString()
	{
		return String.format("Player %s has scored %s goals", name, goals > 0 ? goals : "no");
	}
}