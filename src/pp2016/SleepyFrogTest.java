package pp2016;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SleepyFrogTest extends ConsoleTest
{

	@Test
	void setColour()
	{
		Color testCol = new Color(25, 25, 21);
		SleepyFrog sut = new SleepyFrog();
		Color initialColor = sut.getColour();
		sut.setColour(testCol);
		assertEquals(initialColor, sut.getColour());
	}


	@Test
	void setPosition_Dreaming_Move()
	{
		SleepyFrog sut = new SleepyFrog();
		assertTrue(sut.isAwake());
		sut.setAwake(false);
		sut.startDreaming();
		sut.setPosition(5);
		assertEquals(5, sut.getPosition());
		assertEquals(Color.RED, sut.getColour());
		assertEquals("Jump\nCroak\nJump\nCroak\nJump\nCroak", getStrippedConsole());
	}


	@Test
	void setPosition_NotDreaming_Move()
	{
		SleepyFrog sut = new SleepyFrog();
		assertTrue(sut.isAwake());
		sut.setAwake(false);
		sut.setPosition(5);
		assertEquals(5, sut.getPosition());
		assertEquals(Color.YELLOW, sut.getColour());
		assertEquals("Jump\nCroak", getStrippedConsole());
	}


	@Test
	void setPosition_Dreaming_NotMove()
	{
		SleepyFrog sut = new SleepyFrog();
		Color currentColor = sut.getColour();
		assertTrue(sut.isAwake());
		sut.setAwake(false);
		sut.startDreaming();
		sut.setPosition(1);
		assertEquals(1, sut.getPosition());
		assertEquals(currentColor, sut.getColour());
		assertEquals("", getStrippedConsole());
	}


	@Test
	void setPosition_NotDreaming_NotMove()
	{
		SleepyFrog sut = new SleepyFrog();
		Color currentColor = sut.getColour();
		assertTrue(sut.isAwake());
		sut.setAwake(false);
		sut.setPosition(1);
		assertEquals(1, sut.getPosition());
		assertEquals(currentColor, sut.getColour());
		assertEquals("", getStrippedConsole());
	}


	@Test
	void setPosition_Awake_Move()
	{
		SleepyFrog sut = new SleepyFrog();
		Color currentColor = sut.getColour();
		assertTrue(sut.isAwake());
		sut.setAwake(true);
		sut.setPosition(5);
		assertEquals(5, sut.getPosition());
		assertEquals(currentColor, sut.getColour());
		assertEquals("", getStrippedConsole());
	}
}