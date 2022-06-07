package pp2019;

public class Branch
{
	private String name;
	private String address;

	public Branch(String name){
		this.name = name;
	}

	public String getName()
	{
		return name;
	}


	public String getAddress()
	{
		return address;
	}


	public void setAddress(String aAddress)
	{
		address = aAddress;
	}


	public boolean equals(Branch otherBranch)
	{
		return this.name.equals(otherBranch.name);
	}


}