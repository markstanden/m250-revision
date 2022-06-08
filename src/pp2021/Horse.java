package pp2021;

public class Horse
{
	public static int vetFee;

	private String name;

	private int wins;
	private Owner owner;
	private int fees;


	public Horse(String aName, Owner theOwner)
	{

		owner = theOwner;
		name = aName;
		wins = 0;
		fees = 0;
		vetFee = 25;
	}



	public String getName()
	{
		return name;
	}


	public int getWins()
	{
		return wins;
	}


	public Owner getOwner()
	{
		return owner;
	}


	public void setOwner(Owner theOwner)
	{
		owner = theOwner;
	}


	public int getFees()
	{
		return fees;
	}


	public void setFees(int theFees)
	{
		fees = theFees;
	}


	public void winRace()
	{
		wins++;
	}


	public String enterRace()
	{
		String lastName = owner.getName()
		                       .split(" ")[1];
		return String.format("A horse owned by %s is running in the race", lastName);
	}


	@Override
	public boolean equals(Object obj)
	{
		if(! (obj instanceof Horse)) {
			return false;
		}

		Horse anotherHorse = (Horse) obj;

		return name.equals(anotherHorse.name);
	}
}