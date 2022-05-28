package ch3;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Q1Test
{

	@org.junit.jupiter.api.Test
	void bothSameValue()
	{
		var sut = new Q1();
		assertTrue(sut.bothSameValue(true, true));
		assertTrue(sut.bothSameValue(false, false));
		assertFalse(sut.bothSameValue(true, false));
		assertFalse(sut.bothSameValue(false, true));
	}


	@org.junit.jupiter.api.Test
	void onlyOneTrue()
	{
		var sut = new Q1();
		assertTrue(sut.onlyOneTrue(true, false));
		assertTrue(sut.onlyOneTrue(false, true));
		assertFalse(sut.onlyOneTrue(true, true));
		assertFalse(sut.onlyOneTrue(false, false));
	}
}