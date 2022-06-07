package pp2016;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.engine.descriptor.ClassTestDescriptor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SnapTest extends ConsoleTest
{

	@Test
	void play()
	{
		Snap sut = new Snap();
		sut.play();
		assertTrue(Integer.parseInt(getStrippedConsole()) <= 26);
	}
}