package pp2013;

public abstract class Frog
{
	public static int MAX_STONES = 10;

	protected int pos;


	public Frog()
	{
		this(1);
	}


	public Frog(int initialPos) throws IllegalArgumentException
	{
		if(initialPos > MAX_STONES || initialPos < 1) {
			throw new IllegalArgumentException("Invalid number of stones.");
		}
		pos = initialPos;
	}


	public void jump()
	{
		System.out.println("Jump");
	}


	public void moveLeft(int numberOfStones)
	{
		if(pos > 1) {
			pos -= numberOfStones;
			System.out.printf("Left %d\n", numberOfStones);
		}
	}


	public void moveRight(int numberOfStones)
	{
		if(pos < MAX_STONES) {
			pos += numberOfStones;
			System.out.printf("Right %d\n", numberOfStones);
		}
	}


	public void croak()
	{
		System.out.println("Croak");
	}
}