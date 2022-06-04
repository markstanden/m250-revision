package pp2015;

import MadeUpOULibrary.Frog;

public class LockableFrog extends Frog implements Lockable
{
	private String unlockCode;
	private int unsuccessfulAttempts = 0;
	private boolean locked;


	public LockableFrog(String anUnlockCode)
	{
		super();
		locked = true;
		unlockCode = anUnlockCode;
	}


	public String getUnlockCode()
	{
		return unlockCode;
	}


	public void setUnlockCode(String anUnlockCode)
	{
		unlockCode = anUnlockCode;
	}


	@Override
	public void setPosition(int newPosition)
	{
		if(! locked) {
			super.setPosition(newPosition);
		}
	}


	public void lock()
	{
		locked = true;
	}


	public void unlock(String unlockCodeAttempt)
	{
		// if locked return immediately
		if(! locked) {
			return;
		}

		// check valid attempts are available
		if(unsuccessfulAttempts >= 3) {
			System.out.println("Attempts exhausted");
		}
		else {
			if(unlockCode.equals(unlockCodeAttempt)) {
				locked = false;
				unsuccessfulAttempts = 0;
			}
			else {
				unsuccessfulAttempts++;
			}
		}
	}


	public boolean isLocked()
	{
		return locked;
	}
}