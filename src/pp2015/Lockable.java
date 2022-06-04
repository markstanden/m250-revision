package pp2015;

public interface Lockable
{
	void unlock(String unlockCodeAttempt);


	void lock();
}