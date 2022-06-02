package specimen;

public class Q5
{
	public class House
	{
		private String material;


		private int age;


		public House(String aMaterial, int anAge)
		{
			material = aMaterial;
			age = anAge;
		}


		public String getMaterial()
		{
			return material;
		}


		public int getAge()
		{
			return age;
		}


		public void setAge(int anAge)
		{
			age = anAge;
		}


		public void setMaterial(String aMaterial)
		{
			material = aMaterial;
		}


		public String about()
		{
			return String.format("A %s house of age %d", material, age);
		}


		public boolean equals(House toCompare)
		{
			return material.equals(toCompare.material) && age == toCompare.age;
		}


	}
}