package ch12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1Test
{
	@Test
	void Test()
	{
		var base = new Q1();
		var sut = base.new Watch(265);
		assertEquals("The timer says: 4 minutes 25.00 seconds", sut.displayTime());
	}
}