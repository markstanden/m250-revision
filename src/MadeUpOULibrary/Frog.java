package MadeUpOULibrary;

public abstract class Frog extends Amphibian
{
	public Frog(int initialPos) throws IllegalArgumentException
	{
		super(initialPos);
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
}