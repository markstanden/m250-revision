package pp2021;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConcertTest extends ConsoleTest
{

	@Test
	void getConcertLength_0()
	{
		var sut = new Concert("2022-01-01", "Test");
		assertEquals(0, sut.getConcertLength());
		assertEquals("", getStrippedConsole());
	}


	@Test
	void getConcertLengthMAX()
	{
		var sut = new Concert("2022-01-01", "Test");
		sut.addProgrammeItem(new Music("Test", "Test", Concert.MAX_LENGTH));
		assertEquals(Concert.MAX_LENGTH, sut.getConcertLength());
		assertEquals("", getStrippedConsole());
	}


	@Test
	void getConcertLengthMAXplus1()
	{
		var sut = new Concert("2022-01-01", "Test");
		sut.addProgrammeItem(new Music("Test", "Test", Concert.MAX_LENGTH + 1));
		assertEquals(0, sut.getConcertLength());
		assertEquals("Running time exceeded", getStrippedConsole());
	}
}