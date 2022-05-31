package pp2013;

import MadeUpOULibrary.Frog;

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
			right(1);
			croak();
		}
	}


	@Override
	public void marchToMiddle()
	{
		while(position != 5) {
			jump();
			if(position < 5) {
				right(1);
			}
			else if(position > 5) {
				left(1);
			}
		}
	}
}