package pp2016;

public class Document
{
	private String text;


	public Document(String aText)
	{
		text = aText;
	}


	public void merge(Document aDocument)
	{
		text += " " + aDocument.text;
	}


	public boolean equals(Document d)
	{
		return text.equals(d.text);
	}


}