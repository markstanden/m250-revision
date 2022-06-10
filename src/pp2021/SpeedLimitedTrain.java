package pp2021;

public class SpeedLimitedTrain extends Train
{
	private int maxPower;
	private int speedLimit;


	public SpeedLimitedTrain(int speedLimit)
	{
		super();
		maxPower = 10;
		this.speedLimit = speedLimit;
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