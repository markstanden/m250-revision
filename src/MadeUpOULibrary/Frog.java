package MadeUpOULibrary;

public abstract class Frog extends Amphibian
{
	public static int MAX_STONES = 10;

	protected int position;


	public Frog()
	{
		this(1);
	}


	public Frog(int initialPos) throws IllegalArgumentException
	{
		super();
		if(initialPos > MAX_STONES || initialPos < 1) {
			throw new IllegalArgumentException("Invalid starting location.");
		}
		position = initialPos;
	}


	public void setPosition(int aPosition)
	{
		position = aPosition;
	}


	public int getPosition()
	{
		return position;
	}


	public void jump()
	{
		System.out.println("Jump");
	}


	public void left(int numberOfStones)
	{
		if(position > 1) {
			setPosition(position - numberOfStones);
			System.out.printf("Left %d\n", numberOfStones);
		}
	}


	public void right(int numberOfStones)
	{
		if(position < MAX_STONES) {
			setPosition(position + numberOfStones);
			System.out.printf("Right %d\n", numberOfStones);
		}
	}


	public void croak()
	{
		System.out.println("Croak");
	}
}