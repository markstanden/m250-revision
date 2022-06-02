package specimen.OU;

import java.awt.*;

/**
 * Simple model of a Person that has a first name,
 * a last name, some money, some friends, and a shirt colour.
 *
 * @author M250 Module Team
 * @version 1.1
 */
public class Person
{
	private String firstName;
	private String lastName;
	private int money;
	private int numFriends;
	private Color shirtColour;


	/**
	 * Constructor for objects of class Person
	 * that initialises first and last name
	 * using the received parameters.
	 * Also sets money to 100 and numFriends to 1.
	 * The shirtColour is set to white.
	 */
	public Person(String afirstName, String aLastName)
	{
		firstName = afirstName;
		lastName = aLastName;
		money = 100;
		numFriends = 1;
		shirtColour = Color.WHITE;
	}


	/**
	 * Returns the firstName of the Person.
	 */
	public String getFirstName()
	{
		return firstName;
	}


	/**
	 * Returns the lastName of the Person.
	 */
	public String getLastName()
	{
		return lastName;
	}


	/**
	 * Sets the lastName of the Person.
	 */
	public void setLastName(String aName)
	{
		lastName = aName;
	}


	/**
	 * Sets the firstName of the Person.
	 */
	public void setFirstName(String aName)
	{
		firstName = aName;
	}


	/**
	 * Gets the numFriends of the Person.
	 */
	public int getNumFriends()
	{
		return numFriends;
	}


	/**
	 * Sets the numFriends of the Person.
	 */
	public void setNumFriends(int friends)
	{
		numFriends = friends;
	}


	/**
	 * Returns the current money of the Person.
	 */
	public int getMoney()
	{
		return money;
	}


	/**
	 * Returns the current shirtColour
	 */
	public Color getShirtColour()
	{
		return shirtColour;
	}


	/**
	 * Sets the money of the Person to the value of the argument.
	 */
	public void setMoney(int someMoney)
	{
		money = someMoney;
	}


	/**
	 * Sets the shirtColour of the Person to the value of the argument.
	 */
	public void setShirtColour(Color aColour)
	{
		shirtColour = aColour;
	}


	/**
	 * Spends some money
	 */
	public void spendMoney(int someMoney)
	{
		money -= someMoney;
	}


	/**
	 * Adds some money
	 */
	public void getSomeMoney(int someMoney)
	{
		money += someMoney;
	}


	/**
	 * Returns a string representation of the Person.
	 */
	public String toString()
	{
		return "A Person with first Name " + firstName + "last Name " + lastName + " money " + money + " shirt colour " + shirtColour;
	}
}