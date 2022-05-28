package ch3;

public class Q1
{
	/**
	 * Returns true if a and b are the same value.
	 */
	public boolean bothSameValue(final boolean a, final boolean b)
	{
		return a == b;
	}


	/**
	 * Returns true if only one argument is true. (Exclusive or)
	 */
	public boolean onlyOneTrue(final boolean a, final boolean b)
	{
		// return (a || b) && !(a && b); works, but is also the opposite of bothSameValue
		return a != b;
	}
}