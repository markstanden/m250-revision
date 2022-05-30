package pp2013;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrainableFrogTest extends ConsoleTest
{

	@Test
	void pushUps()
	{
		var sut = new TrainableFrog();
		sut.pushUps(1);
		assertEquals("Jump\nRight 1\nCroak", getStrippedConsole());
	}


	@Test
	void pushUps3()
	{
		var sut = new TrainableFrog();
		sut.pushUps(3);
		assertEquals("Jump\nRight 1\nCroak\nJump\nRight 1\nCroak\nJump\nRight 1\nCroak", getStrippedConsole());
	}


	@Test
	void march1L()
	{
		var sut = new TrainableFrog(4);
		sut.marchToMiddle();
		assertEquals("Jump\nRight 1", getStrippedConsole());
	}


	@Test
	void march1R()
	{
		var sut = new TrainableFrog(6);
		sut.marchToMiddle();
		assertEquals("Jump\nLeft 1", getStrippedConsole());
	}


	@Test
	void march1()
	{
		var sut = new TrainableFrog();
		sut.marchToMiddle();
		assertEquals("Jump\nRight 1\nJump\nRight 1\nJump\nRight 1\nJump\nRight 1", getStrippedConsole());
	}


	@Test
	void march9()
	{
		var sut = new TrainableFrog(9);
		sut.marchToMiddle();
		assertEquals("Jump\nLeft 1\nJump\nLeft 1\nJump\nLeft 1\nJump\nLeft 1", getStrippedConsole());
	}


}