package MadeUpOULibrary;

import java.awt.*;

public class Amphibian
{
	public static int MAX_STONES = 10;

	protected int position;

	private Color colour;



	public Color getColour()
	{
		return new Color(colour.getRGB());
	}


	public Amphibian(int initialPos) throws IllegalArgumentException
	{
		colour = Color.DARK_GRAY;
		if(initialPos > MAX_STONES || initialPos < 1) {
			throw new IllegalArgumentException("Invalid starting location.");
		}
		position = initialPos;
	}


	public void setColour(Color aColour)
	{
		colour = aColour;
	}


	public void setPosition(int aPosition)
	{
		position = aPosition;
	}


	/**
	 * Returns the current position of the amphibian
	 *
	 * @return the int representing the stone the amphibian is currently on
	 */
	public int getPosition()
	{
		return position;
	}


	/**
	 * Moves the amphibian left by the number of supplied stones
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
	 * Moves the amphibian right by the number of supplied stones
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