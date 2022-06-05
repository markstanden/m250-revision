package pp2017;

import MadeUpOULibrary.Frog;

import java.awt.*;

public class TrainableFrog extends Frog implements Trainable
{

	boolean isTraining;


	public TrainableFrog()
	{
		super();
		isTraining = false;
	}


	@Override
	public void setColour(Color colour)
	{
		if(isTraining) {
			super.setColour(colour);
		}
	}


	@Override
	public void startTraining(int maxReps)
	{
		isTraining = true;
		setColour(Color.GREEN);
		int currentReps = 0;
		while(maxReps > currentReps) {
			jump();
			currentReps++;
			if(currentReps >= 2 && currentReps < 5) {
				setColour(new Color(60, 30, 00)); //brown
			}
			else if(currentReps >= 5) {
				setColour(Color.RED);
			}
		}

	}


	@Override
	public void stopTraining()
	{
		isTraining = false;
		while(position != 5) {
			if(position < 5) {
				right(1);
			}
			else {
				left(1);
			}
		}
		croak();
	}
}