package ch2;

/**
 * Complete the class Person to add the features required
 */
public class Person
{
	private final String name;
	private int age;


	/**
	 * Create a new person object.
	 *
	 * @param myName
	 * 		Person's name
	 * @param myAge
	 * 		Person's age
	 */
	public Person(String myName, int myAge)
	{
		name = myName;
		age = myAge;
	}


	/**
	 * Public accessor for the name field.
	 *
	 * @return Person's name.
	 */
	public String getName()
	{
		return name;
	}


	/**
	 * Public accessor for the age field.
	 *
	 * @return Person's age.
	 */
	public int getAge()
	{
		return age;
	}


	/**
	 * Public setter for the age field.
	 */
	public void setAge(int newAge)
	{
		age = newAge;
	}


	/**
	 * Prints the details of the person to the console.
	 */
	public void printDetails()
	{
		String output = String.format("A person called %s aged %d.", name, age);
		System.out.println(output);
	}
}