package pp2013;

public class PostalAddress
{
	private final String firstLine;
	private final String secondLine;
	private final String postCode;


	public PostalAddress(String aFirstLine, String aSecondLine, String aPostCode)
	{
		firstLine = aFirstLine;
		secondLine = aSecondLine;
		postCode = aPostCode;
	}


	public String getDeliveryInfo()
	{
		return postCode.substring(postCode.length() - 3);
	}


	public String getAddress(String postCodeToCheck)
	{
		if(postCode.equals(postCodeToCheck)) {
			return String.format("%s %s %s", firstLine, secondLine, postCode);
		}
		else {
			return "no match";
		}
	}
}