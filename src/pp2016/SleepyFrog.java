package pp2016;

import MadeUpOULibrary.Frog;

import java.awt.*;

/**
 * Q2-b-i.
 */
public class SleepyFrog extends Frog implements Dream
{
	/**
	 * Q2-b-ii.
	 */
	private boolean awake;


	private boolean dreaming;
	/**
	 * Q2-b-ii.
	 */
	public SleepyFrog()
	{
		super();
		awake = true;
		dreaming = false;
	}


	@Override
	public void setColour(Color colour)
	{
	}


	/**
	 * if asleep the value of dreaming is set to true
	 */
	@Override
	public void startDreaming()
	{
		if(! awake) {
			dreaming = true;
		}
	}


	/**
	 * if asleep the value of dreaming is set to false
	 */
	@Override
	public void stopDreaming()
	{
		if(! awake) {
			dreaming = false;
		}
	}


	private void rouse(int reps)
	{
		for(int rep = 1; rep <= reps; rep++) {
			jump();
			croak();
		}
	}


	@Override
	public void setPosition(int newPosition)
	{
		if(awake) {
			super.setPosition(newPosition);
		}
		else {
			if(getPosition() != newPosition) {
				// SleepyFrog must move
				awake = true;

				if(dreaming) {
					dreaming = false;
					super.setColour(Color.RED);
					rouse(3);
				}
				else {
					super.setColour(Color.YELLOW);
					rouse(1);
				}
				super.setPosition(newPosition);
			}
		}
	}


	public boolean isAwake()
	{
		return awake;
	}


	public void setAwake(boolean isAwake)
	{
		awake = isAwake;
	}

}