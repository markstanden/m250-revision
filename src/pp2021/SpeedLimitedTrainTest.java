package pp2021;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpeedLimitedTrainTest extends ConsoleTest
{

	@Test
	void go_overLimit()
	{
		var sut = new SpeedLimitedTrain(90);
		sut.setPower(10);
		sut.go(91);
		assertEquals(0, sut.getSpeed());
	}


	@Test
	void go_atLimit()
	{
		var sut = new SpeedLimitedTrain(90);
		sut.setPower(10);
		sut.go(90);
		assertEquals(90, sut.getSpeed());
	}


	@Test
	void go_underLimit()
	{
		var sut = new SpeedLimitedTrain(90);
		sut.setPower(10);
		sut.go(89);
		assertEquals(80, sut.getSpeed());
	}
	@Test
	void go_negative()
	{
		var sut = new SpeedLimitedTrain(90);
		sut.setPower(10);
		sut.go(-10);
		assertEquals(0, sut.getSpeed());
	}


	@Test
	void setPower()
	{
		var sut = new SpeedLimitedTrain(90);
		sut.setPower(10);
		sut.setPower(-1);

		assertEquals(10, sut.getPower());
	}

	@Test
	void setPower_11()
	{
		var sut = new SpeedLimitedTrain(90);
		sut.setPower(11);

		assertEquals(10, sut.getPower());
	}
}