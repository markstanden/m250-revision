package pp2021;

public class Owner
{
	private String name;


	public Owner(String firstName, String secondName)
	{
		name = String.format("%s %s", firstName, secondName);
	}


	public String getName()
	{
		return name;
	}


	public void setName(String aName)
	{
		name = aName;
	}
}