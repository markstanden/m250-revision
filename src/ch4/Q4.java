package ch4;

public class Q4
{
	public class Multiples
	{
		// add your method here
		public void multiplesOfFive(int start, int end)
		{
			for(int i = start; i <= end; i++) {
				if(i % 5 == 0) {
					System.out.println(i);
				}
			}
		}
	}
}