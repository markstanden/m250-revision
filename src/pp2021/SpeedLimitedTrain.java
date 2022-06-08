package pp2021;

public class SpeedLimitedTrain extends Train
{
	private int maxPower;
	private int speedLimit;


	public SpeedLimitedTrain()
	{
		super();
		maxPower = 10;
		speedLimit = 100;
	}


	@Override
	public void go(int targetSpeed)
	{
		if(targetSpeed <= speedLimit) {
			super.go(targetSpeed);
		}
	}


	@Override
	public void setPower(int aPower)
	{
		super.setPower(aPower > maxPower ? maxPower : aPower);
	}
}