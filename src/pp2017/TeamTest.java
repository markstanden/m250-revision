package pp2017;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TeamTest extends ConsoleTest
{

	@Test
	void testToString()
	{
		Team myTeam = new Team();
		System.out.println(myTeam);
		assertEquals("Team  has the following players:\n", getStrippedConsole());
	}
}