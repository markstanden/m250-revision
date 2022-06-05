package pp2017;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrainableFrogTest extends ConsoleTest
{

	@Test
	void setColour()
	{
		TrainableFrog sut = new TrainableFrog();
		sut.setColour(Color.BLACK);
		assertEquals(Color.DARK_GRAY, sut.getColour());
	}


	@Test
	void startTraining1()
	{
		TrainableFrog sut = new TrainableFrog();
		sut.startTraining(1);
		assertEquals(Color.GREEN, sut.getColour());
	}


	@Test
	void startTraining2()
	{
		TrainableFrog sut = new TrainableFrog();
		sut.startTraining(2);
		assertEquals(new Color(60, 30, 0), sut.getColour());
		assertEquals("Jump\nJump", getStrippedConsole());
	}


	@Test
	void startTraining4()
	{
		TrainableFrog sut = new TrainableFrog();
		sut.startTraining(4);
		assertEquals(new Color(60, 30, 0), sut.getColour());
		assertEquals("Jump\nJump\nJump\nJump", getStrippedConsole());

	}


	@Test
	void startTraining5()
	{
		TrainableFrog sut = new TrainableFrog();
		sut.startTraining(5);
		assertEquals(Color.RED, sut.getColour());
		assertEquals("Jump\nJump\nJump\nJump\nJump", getStrippedConsole());
	}


	@Test
	void startTraining6()
	{
		TrainableFrog sut = new TrainableFrog();
		sut.startTraining(6);
		assertEquals(Color.RED, sut.getColour());
		assertEquals("Jump\nJump\nJump\nJump\nJump\nJump", getStrippedConsole());
	}


	@Test
	void stopTraining1()
	{
		TrainableFrog sut = new TrainableFrog();
		sut.startTraining(1);
		sut.setPosition(1);
		sut.stopTraining();
		assertEquals(5, sut.getPosition());
		assertEquals("Jump\nRight 1\nRight 1\nRight 1\nRight 1\nCroak", getStrippedConsole());
	}


	@Test
	void stopTraining4()
	{
		TrainableFrog sut = new TrainableFrog();
		sut.startTraining(1);
		sut.setPosition(4);
		sut.stopTraining();
		assertEquals(5, sut.getPosition());
		assertEquals("Jump\nRight 1\nCroak", getStrippedConsole());
	}


	@Test
	void stopTraining5()
	{
		TrainableFrog sut = new TrainableFrog();
		sut.startTraining(1);
		sut.setPosition(5);
		sut.stopTraining();
		assertEquals(5, sut.getPosition());
		assertEquals("Jump\nCroak", getStrippedConsole());
	}


	@Test
	void stopTraining6()
	{
		TrainableFrog sut = new TrainableFrog();
		sut.startTraining(1);
		sut.setPosition(6);
		sut.stopTraining();
		assertEquals(5, sut.getPosition());
		assertEquals("Jump\nLeft 1\nCroak", getStrippedConsole());
	}

	@Test
	void stopTraining10()
	{
		TrainableFrog sut = new TrainableFrog();
		sut.startTraining(1);
		sut.setPosition(10);
		sut.stopTraining();
		assertEquals(5, sut.getPosition());
		assertEquals("Jump\nLeft 1\nLeft 1\nLeft 1\nLeft 1\nLeft 1\nCroak", getStrippedConsole());
	}
}