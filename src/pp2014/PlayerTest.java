package pp2014;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest
{

	@Test
	void testToString()
	{
		var sut = new Player("Test");
		sut.addGoals(1);

		var expected = "Player Test has scored 1 goals";
		var actual = sut.toString();

		assertEquals(expected, actual);
	}

	@Test
	void testToStringNo()
	{
		var sut = new Player("Test");

		var expected = "Player Test has scored no goals";
		var actual = sut.toString();

		assertEquals(expected, actual);
	}
}