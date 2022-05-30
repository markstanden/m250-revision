package pp2013;

public class TrainableFrog extends Frog implements Trainable
{
	public TrainableFrog()
	{
		super();
	}


	public TrainableFrog(int initialPos)
	{
		super(initialPos);
	}


	@Override
	public void pushUps(int numberToPerform)
	{
		for(int i = 0; i < numberToPerform; i++) {
			jump();
			moveRight(1);
			croak();
		}
	}


	@Override
	public void marchToMiddle()
	{
		while(pos != 5) {
			jump();
			if(pos < 5) {
				moveRight(1);
			}
			else if(pos > 5) {
				moveLeft(1);
			}
		}
	}
}