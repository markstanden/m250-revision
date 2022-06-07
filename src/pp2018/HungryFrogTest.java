package pp2018;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HungryFrogTest extends ConsoleTest
{

	void setPosition_OK(int start)
	{
		HungryFrog sut = new HungryFrog();
		sut.setPosition(2);
		sut.setEnergyLevel(100);
		sut.setPosition(1);
		assertEquals(1, sut.getPosition());
	}


	@Test
	void feed1()
	{
		HungryFrog sut = new HungryFrog();
		sut.setPosition(1);
		sut.feed();
		assertEquals("", getStrippedConsole());
		assertEquals(1,sut.getPosition());
	}

	@Test
	void feed5()
	{
		HungryFrog sut = new HungryFrog();
		sut.setPosition(5);
		sut.setEnergyLevel(500);
		sut.feed();
		assertEquals(1,sut.getPosition());
	}

	@Test
	void feed6()
	{
		HungryFrog sut = new HungryFrog();
		sut.setPosition(6);
		sut.setEnergyLevel(500);
		sut.feed();
		assertEquals(10,sut.getPosition());
	}

	@Test
	void feed5_LowEnergy()
	{
		HungryFrog sut = new HungryFrog();
		sut.setPosition(5);
		sut.setEnergyLevel(300); // Enough for 3 jumps only
		sut.feed();
		assertEquals("Insufficient energy to move", getStrippedConsole());
		assertEquals(5,sut.getPosition());
	}

	@Test
	void feed6_LowEnergy()
	{
		HungryFrog sut = new HungryFrog();
		sut.setPosition(5);
		sut.setEnergyLevel(300); // Enough for 3 jumps only
		sut.feed();
		assertEquals("Insufficient energy to move", getStrippedConsole());
		assertEquals(5,sut.getPosition());
	}


	@Test
	void getInstanceCount()
	{
		int startingInstanceCount = HungryFrog.getInstanceCount();
		HungryFrog sut = new HungryFrog();
		assertTrue(HungryFrog.getInstanceCount() - startingInstanceCount == 1);

	}
}