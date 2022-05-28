package ch2;

public class Pet
{
	/** field called name of type String */
	private final String name;


	/**
	 * Constructor
	 */
	public Pet(String petsName)
	{
		name = petsName;
	}


	/**
	 * Getter method for the name field
	 */
	public String getName()
	{
		return name;
	}
}