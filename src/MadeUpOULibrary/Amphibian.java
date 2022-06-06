package MadeUpOULibrary;

import java.awt.*;

public class Amphibian
{
	private Color colour;


	public Amphibian()
	{
		colour = Color.DARK_GRAY;
	}


	public Color getColour()
	{
		return new Color(colour.getRGB());
	}


	public void setColour(Color aColour)
	{
		colour = aColour;
	}


}