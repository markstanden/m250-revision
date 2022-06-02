package specimen;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q4Test extends ConsoleTest
{
	Q4 q = new Q4();
	Q4.Test sut = q.new Test(new int[]{0, 1, 2, 3, 4, 5, 6});


	@Test
	public void concatSingleTest()
	{
		sut.concatenateThese(0, 0);
		assertEquals("0", getStrippedConsole());
	}

	@Test
	public void concatMidTest()
	{
		sut.concatenateThese(1, 3);
		assertEquals("123", getStrippedConsole());
	}

	@Test
	public void concatFullTest()
	{
		sut.concatenateThese(0, 6);
		assertEquals("0123456", getStrippedConsole());
	}
}