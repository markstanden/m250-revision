package pp2014;

import MadeUpOULibrary.Frog;

import java.util.Set;

public class HungryFrog extends Frog implements Feedable
{
	public static final int FULL = 2000;
	int energyLevel;


	public HungryFrog()
	{
		super();
		energyLevel = FULL;
	}


	public int getEnergyLevel()
	{
		return energyLevel;
	}


	public void setEnergyLevel(int anEnergyLevel)
	{
		energyLevel = anEnergyLevel;
	}


	@Override
	public void setPosition(int newPosition)
	{
		final int ENERGY_PER_STONE_JUMP = 100;
		int numberOfJumps = Math.abs(position - newPosition);
		int energyRequired = numberOfJumps * ENERGY_PER_STONE_JUMP;

		if(energyRequired <= energyLevel) {
			energyLevel -= energyRequired;
			super.setPosition(newPosition);
		}
	}


	@Override
	public boolean feed()
	{
		final Set<Integer> FEEDING_STONES = Set.of(1, 10);

		if(! FEEDING_STONES.contains(position)) {
			if(position <= 5) {
				setPosition(1);
			}
			else {
				setPosition(10);
			}
		}

		if(FEEDING_STONES.contains(position)) {
			while(energyLevel < FULL) {
				energyLevel += 100;
				croak();
			}
			return true;
		}
		else {
			return false;
		}
	}
}