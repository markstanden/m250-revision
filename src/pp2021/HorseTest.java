package pp2021;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HorseTest extends ConsoleTest
{

	@Test
	void enterRace()
	{
		var surname = "McTestFace";
		var sut = new Horse("Gluey", new Owner("Testy", surname));
		assertEquals("A horse owned by " + surname + " is running in the race", sut.enterRace());
	}
}