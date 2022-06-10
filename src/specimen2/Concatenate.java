package specimen2;

import java.util.Arrays;

public class Concatenate
{
	private int[] nums;


	public Concatenate(int[] vals)
	{
		nums = vals;
	}


	public void concatenateThese(int startIncl, int endIncl)
	{
		Arrays.stream(nums)
		      .skip(startIncl)
		      .limit(endIncl - startIncl + 1)
		      .forEach(val -> System.out.printf(String.valueOf(val)));
	}
}