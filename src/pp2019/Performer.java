package pp2019;

public class Performer
{
	public static double minPayRate;
	private String equityName;


	private double payRate;


	private Branch branch;


	public Performer(String aName)
	{
		equityName = aName;
		branch = null;
		payRate = minPayRate;
	}


	public String getEquityName()
	{
		return equityName;
	}


	public Branch getBranch()
	{
		return branch;
	}


	public void setBranch(Branch aBranch)
	{
		branch = aBranch;
	}


	public void setPayRate(int aPayRate)
	{
		payRate = aPayRate;
	}


	/**
	 * Q1-a-ii.
	 *
	 * @param otherPerformer
	 *
	 * @return True if in the same branch.
	 */
	public boolean isInSameBranchAs(Performer otherPerformer)
	{
		// reasonably assume that if they are both not in a branch,
		// that the method should return false.
		if(branch == null || otherPerformer.branch == null) {
			return false;
		}
		return branch.equals(otherPerformer.branch);
	}


	/**
	 * Q1-a-iii
	 */
	public String getFirstName()
	{
		return equityName.split(" ")[0];
	}


	@Override
	public boolean equals(Object obj)
	{
		if(obj.getClass() != Performer.class) {
			return false;
		}

		Performer otherPerformer = (Performer) obj;
		return getEquityName().equals(otherPerformer.getEquityName());
	}
}