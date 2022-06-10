package specimen2;

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


	public void setMaterial(String aMaterial)
	{
		material = aMaterial;
	}


	public int getAge()
	{
		return age;
	}


	public void setAge(int aAge)
	{
		age = aAge;
	}


	public String about()
	{
		return String.format("A %s house of age %s", material, age);
	}


	/**
	 * Test for structual equality between objects.
	 *
	 * @param other
	 * 		the comparison object.
	 *
	 * @return true if referencially or structurally equal.
	 */
	public boolean equals(House other)
	{
		// If other is null, exit early.
		if(other == null) {
			return false;
		}

		// if referentially equal, they are the same object.
		if(this == other) {
			return true;
		}

		// if other is not of the same class, it cannot be equal.
		// Assumption: we are intentionally excluding subclasses.
		if(this.getClass() != other.getClass()) {
			return false;
		}

		// Cast Object first to compare instance values.
		// House otherHouse = (House) other;

		if(this.age != other.age) {
			return false;
		}

		return this.material.equals(other.material);
	}
}