package specimen;

public class Q4
{
	public class Test
	{
		private int[] nums;
		public Test(int[] vals)
		{
			nums = vals;
		}
		// Write your concatenateThese(int, int) method here

		public void concatenateThese(int start, int end){
			String result = "";
			for(int index = start; index <= end; index++) {
				result += String.valueOf(nums[index]);
			}
			System.out.println(result);
		}
	}
}