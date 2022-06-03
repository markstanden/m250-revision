package pp2015;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Q1ClockTest extends ConsoleTest
{
	@Test
	public void stringTest0()
	{
		Q1Clock sut = new Q1Clock(0, 0, 0);
		assertEquals("0:0:0", sut.toString());
	}


	@Test
	public void stringTest59()
	{
		Q1Clock sut = new Q1Clock(23, 59, 59);
		assertEquals("23:59:59", sut.toString());
	}


	@Test
	void increment58()
	{
		Q1Clock sut = new Q1Clock(23, 59, 58);
		sut.increment();
		assertEquals("23:59:59", sut.toString());
	}


	@Test
	void increment59()
	{
		Q1Clock sut = new Q1Clock(23, 59, 59);
		sut.increment();
		assertEquals("0:0:0", sut.toString());
	}


	@Test
	void increment00()
	{
		Q1Clock sut = new Q1Clock(0, 0, 0);
		sut.increment();
		assertEquals("0:0:1", sut.toString());
	}


	@Test
	void testEquals()
	{
		Q1Clock sut = new Q1Clock(0, 0, 0);
		sut.increment();
		assertTrue(sut.equals(new Q1Clock(0, 0, 1)));
	}
}