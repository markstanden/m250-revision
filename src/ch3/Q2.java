package ch3;

public class Q2
{
	private class Triangle
	{
		public Triangle()
		{
		}
	}

	private class Square
	{
		public Square()
		{
		}
	}

	//Complete the class Tree here according to the requirements
	public class Tree
	{
		//1 Add the fields
		private final Triangle leaves;
		private final Square trunk;


		//2 Complete the constructor body
		public Tree()
		{
			leaves = new Triangle();
			trunk = new Square();
		}

		//3 Add the methods


		public Square getTrunk()
		{
			return trunk;
		}


		public Triangle getLeaves()
		{
			return leaves;
		}
	}

}