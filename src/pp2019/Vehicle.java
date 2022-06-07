package pp2019;

/**
 * Q2-b-i
 * implicitly inherits from Object as all classes do.
 */
public class Vehicle implements Drivable
{
	private int speed; //question specifically asks for private, protected would allow it to be inherited.


	@Override
	public void accelerate()
	{
		speed++;
	}


	@Override
	public void brake()
	{
		if(speed > 0) {
			speed--;
		}
	}


	@Override
	public void stop()
	{
		while(speed != 0) {
			speed--;
		}
	}
}