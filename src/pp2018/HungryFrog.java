package pp2018;

import MadeUpOULibrary.Frog;

public class HungryFrog extends Frog implements Feedable
{
	public static final int FULL = 2000;


	private static int instanceCount = 0;


	private int energyLevel;

	public HungryFrog()
	{
		super();
		energyLevel = FULL;
		instanceCount++;
	}


	public int getEnergyLevel()
	{
		return energyLevel;
	}


	public void setEnergyLevel(int anEnergyLevel)
	{
		energyLevel = anEnergyLevel;
	}


	/**
	 * Q2-b-ii.
	 *
	 * @param newPosition
	 * 		the stone to move to.
	 */
	@Override
	public void setPosition(int newPosition)
	{
		final int ENERGY_REQUIRED_PER_MOVE = 100;
		int numberOfMoves = Math.abs(newPosition - getPosition());

		if(energyLevel >= ENERGY_REQUIRED_PER_MOVE * numberOfMoves) {
			super.setPosition(newPosition);
		}
		else {
			System.out.println("Insufficient energy to move");
		}
	}


	/**
	 * Q2-b-iii.
	 *
	 * @return
	 */
	@Override
	public boolean feed()
	{
		final int FEEDING_STONE_LOW = 1;
		final int FEEDING_STONE_HIGH = 10;

		// Floor division leaves the highest stone closest to A
		final int MIDWAY_POINT = ((FEEDING_STONE_HIGH - FEEDING_STONE_LOW) + 1) / 2;  // 5

		if(getPosition() != FEEDING_STONE_LOW && getPosition() != FEEDING_STONE_HIGH) {
			// not on a feeding stone yet.  attempt to move.
			if(getPosition() <= MIDWAY_POINT) {
				setPosition(FEEDING_STONE_LOW);
			}
			else {
				setPosition(FEEDING_STONE_HIGH);
			}
		}

		if(getPosition() == FEEDING_STONE_LOW || getPosition() == FEEDING_STONE_HIGH) {
			while(energyLevel < FULL) {
				energyLevel += 100;
				croak();
			}
			return true;
		}
		return false;
	}


	public static int getInstanceCount()
	{
		return instanceCount;
	}
}