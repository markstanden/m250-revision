package pp2019;

public class Car extends Vehicle
{
	private int speed;
	private int maxSpeed;
	private int increment;


	@Override
	public void accelerate()
	{
		if(speed + increment <= maxSpeed) {
			speed += increment;
		}
	}


	/**
	 * Keeping count of Car objects using a static variable
	 */
	private static int carCounter = 0;


	public static int getCarCounter()
	{
		return carCounter;
	}


	public Car()
	{
		super();
		maxSpeed = 70;
		increment = 10;
		carCounter++;
		// other constructory stuff goes here...
	}
}