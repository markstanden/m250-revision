package MadeUpOULibrary;

public abstract class Frog extends Amphibian
{
	public static int MAX_STONES = 10;

	protected int position;


	public Frog(int initialPos) throws IllegalArgumentException
	{
		super();
		if(initialPos > MAX_STONES || initialPos < 1) {
			throw new IllegalArgumentException("Invalid starting location.");
		}
		position = initialPos;
	}


	public Frog()
	{
		this(1);
	}


	public void jump()
	{
		System.out.println("Jump");
	}


	public void croak()
	{
		System.out.println("Croak");
	}


	public void setPosition(int aPosition)
	{
		position = aPosition;
	}


	/**
	 * Returns the current position of the frog
	 *
	 * @return the int representing the stone the frog is currently on
	 */
	public int getPosition()
	{
		return position;
	}


	/**
	 * Moves the frog left by the number of supplied stones
	 *
	 * @param numberOfStones
	 * 		The number of stones to move.
	 */
	public void left(int numberOfStones)
	{
		if(position > 1) {
			setPosition(position - numberOfStones);
			System.out.printf("Left %d\n", numberOfStones);
		}
	}


	/**
	 * Moves the frog right by the number of supplied stones
	 *
	 * @param numberOfStones
	 * 		The number of stones to move.
	 */
	public void right(int numberOfStones)
	{
		if(position < MAX_STONES) {
			setPosition(position + numberOfStones);
			System.out.printf("Right %d\n", numberOfStones);
		}
	}
}