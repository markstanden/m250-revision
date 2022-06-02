package pp2014;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HungryFrogTest
{

	@Test
	void setPosition_EnergyFullyDepleted()
	{
		// Arrange
		var sut = new HungryFrog();
		sut.setPosition(1);
		sut.setEnergyLevel(500);

		// Act
		sut.setPosition(6);

		// Assert
		var expectedPos = 6;
		var actualPos = sut.getPosition();
		var expectedEnergy = 0;
		var actualEnergy = sut.getEnergyLevel();

		assertEquals(expectedPos, actualPos);
		assertEquals(expectedEnergy, actualEnergy);
	}

	@Test
	void setPositionTest_NotEnoughEnergy()
	{
		// Arrange
		var sut = new HungryFrog();
		sut.setPosition(1);
		sut.setEnergyLevel(500);

		// Act
		sut.setPosition(7);

		// Assert
		var expectedPos = 1;
		var actualPos = sut.getPosition();
		var expectedEnergy = 500;
		var actualEnergy = sut.getEnergyLevel();

		assertEquals(expectedPos, actualPos);
		assertEquals(expectedEnergy, actualEnergy);
	}

	@Test
	void setPositionTest_LoadsOfEnergy()
	{
		// Arrange
		var sut = new HungryFrog();
		sut.setPosition(1);
		sut.setEnergyLevel(5000);

		// Act
		sut.setPosition(10);

		// Assert
		var expectedPos = 10;
		var actualPos = sut.getPosition();
		var expectedEnergy = 4100;
		var actualEnergy = sut.getEnergyLevel();

		assertEquals(expectedPos, actualPos);
		assertEquals(expectedEnergy, actualEnergy);
	}

	@Test
	void feedTest_NotOnFeedingStone_EnoughEnergy_Near1()
	{
		// Arrange
		var sut = new HungryFrog();
		sut.setPosition(2);
		sut.setEnergyLevel(100);

		// Act
		var outcome = sut.feed();

		// Assert
		var expectedPos = 1;
		var actualPos = sut.getPosition();
		var expectedEnergy = HungryFrog.FULL;
		var actualEnergy = sut.getEnergyLevel();

		assertTrue(outcome);
		assertEquals(expectedPos, actualPos);
		assertEquals(expectedEnergy, actualEnergy);
	}

	@Test
	void feedTest_NotOnFeedingStone_NotEnoughEnergy_Near1()
	{
		// Arrange
		var sut = new HungryFrog();
		sut.setPosition(3);
		sut.setEnergyLevel(100);

		// Act
		var outcome = sut.feed();

		// Assert
		var expectedPos = 3;
		var actualPos = sut.getPosition();
		var expectedEnergy = 100;
		var actualEnergy = sut.getEnergyLevel();

		assertFalse(outcome);
		assertEquals(expectedPos, actualPos);
		assertEquals(expectedEnergy, actualEnergy);
	}

	@Test
	void feedTest_NotOnFeedingStone_EnoughEnergy_Near10()
	{
		// Arrange
		var sut = new HungryFrog();
		sut.setPosition(9);
		sut.setEnergyLevel(100);

		// Act
		var outcome = sut.feed();

		// Assert
		var expectedPos = 10;
		var actualPos = sut.getPosition();
		var expectedEnergy = HungryFrog.FULL;
		var actualEnergy = sut.getEnergyLevel();

		assertTrue(outcome);
		assertEquals(expectedPos, actualPos);
		assertEquals(expectedEnergy, actualEnergy);
	}

	@Test
	void feedTest_NotOnFeedingStone_NotEnoughEnergy_Near10()
	{
		// Arrange
		var sut = new HungryFrog();
		sut.setPosition(8);
		sut.setEnergyLevel(100);

		// Act
		var outcome = sut.feed();

		// Assert
		var expectedPos = 8;
		var actualPos = sut.getPosition();
		var expectedEnergy = 100;
		var actualEnergy = sut.getEnergyLevel();

		assertFalse(outcome);
		assertEquals(expectedPos, actualPos);
		assertEquals(expectedEnergy, actualEnergy);
	}

	@Test
	void feedTest_OnFeedingStone1()
	{
		// Arrange
		var sut = new HungryFrog();
		sut.setPosition(1);
		sut.setEnergyLevel(0);

		// Act
		var outcome = sut.feed();

		// Assert
		var expectedPos = 1;
		var actualPos = sut.getPosition();
		var expectedEnergy = HungryFrog.FULL;
		var actualEnergy = sut.getEnergyLevel();

		assertTrue(outcome);
		assertEquals(expectedPos, actualPos);
		assertEquals(expectedEnergy, actualEnergy);
	}

	@Test
	void feedTest_OnFeedingStone10()
	{
		// Arrange
		var sut = new HungryFrog();
		sut.setPosition(10);
		sut.setEnergyLevel(0);

		// Act
		var outcome = sut.feed();

		// Assert
		var expectedPos = 10;
		var actualPos = sut.getPosition();
		var expectedEnergy = HungryFrog.FULL;
		var actualEnergy = sut.getEnergyLevel();

		assertTrue(outcome);
		assertEquals(expectedPos, actualPos);
		assertEquals(expectedEnergy, actualEnergy);
	}
}