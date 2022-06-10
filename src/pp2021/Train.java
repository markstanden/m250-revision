package pp2021;

/**
 * Q2-b-i
 */
public abstract class Train implements Railable
{
	/*
		DO NOT WRITE THESE...
		 */
	private int speed;
	private boolean moving;
	private int power;


	public Train()
	{
		speed = 0;
		moving = false;
		power = 1;
	}


	public int getSpeed()
	{
		return speed;
	}


	public void setSpeed(int aSpeed)
	{
		if(aSpeed >= 0) {
			speed = aSpeed;
		}
	}


	public int getPower()
	{
		return power;
	}


	public void setPower(int aPower)
	{
		if(aPower > 0) {
			power = aPower;
		}
	}


	@Override
	public void stop()
	{
		while(speed > 0) {
			speed--;
		}
		moving = false;
	}


	@Override
	public void go(int targetSpeed)
	{
		moving = true;
		while((speed + power) <= targetSpeed) {
			speed += power;
		}

	}


	@Override
	public void stopAndGo()
	{
		int initialSpeed = speed;
		stop();
		go(initialSpeed);
	}
}