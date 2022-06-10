package specimen2;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConcatenateTest extends ConsoleTest
{

	@Test
	void concatenateThese()
	{
		var sut = new Concatenate(new int[]{1, 2, 3, 4, 5, 6});
		sut.concatenateThese(1, 5);
		assertEquals("23456", getStrippedConsole());
	}

}