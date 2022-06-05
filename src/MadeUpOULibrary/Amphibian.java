package MadeUpOULibrary;

import java.awt.*;

public class Amphibian
{
	public Color getColour()
	{
		return new Color(colour.getRGB());
	}


	private Color colour;


	public Amphibian()
	{
		colour = Color.DARK_GRAY;
	}


	public void setColour(Color aColour)
	{
		colour = aColour;
	}
}