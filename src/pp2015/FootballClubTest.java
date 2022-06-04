package pp2015;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FootballClubTest extends ConsoleTest
{

	@Test
	void set442Formation()
	{
		FootballClub sut = new FootballClub();
		sut.setFormation("4-4-2");
		assertEquals(List.of(4, 4, 2), sut.getFormation());
	}


	@Test
	void set433Formation()
	{
		FootballClub sut = new FootballClub();
		sut.setFormation("4-3-3");
		assertEquals(List.of(4, 3, 3), sut.getFormation());
	}


	@Test
	public void checkGoalieTest()
	{
		FootballClub sut = new FootballClub();
		sut.populate();
		assertEquals("Rob", sut.selectGoalie());
	}


	@Test
	public void teamPrintoutTest()
	{
		FootballClub sut = new FootballClub();
		sut.addPlayer("Andy", "defender");
		sut.addPlayer("Dot", "defender");
		sut.addPlayer("Bill", "defender");
		sut.addPlayer("Alex", "striker");
		sut.addPlayer("Alice", "goalie");
		sut.addPlayer("Harry", "defender");
		sut.addPlayer("Will", "midfielder");
		sut.addPlayer("Johan", "striker");
		sut.addPlayer("Molly", "midfielder");
		sut.addPlayer("Scarlett", "midfielder");
		sut.addPlayer("Joan", "midfielder");
		sut.setFormation("4-4-2");
		sut.teamPrintout();
		List<String> lines = consoleToStream().toList();
		//assertTrue(lines.size() >= 4);
		assertTrue(lines.get(0)
		                .contains("Defenders are ["), "Def intro");
		assertTrue(lines.get(0)
		                .contains("Andy"), "Def Player");
		assertTrue(lines.get(0)
		                .contains("Dot"));
		assertTrue(lines.get(0)
		                .contains("Bill"));
		assertTrue(lines.get(0)
		                .contains("Harry"));
		assertTrue(lines.get(1)
		                .contains("Midfielders are ["));
		assertTrue(lines.get(1)
		                .contains("Will"));
		assertTrue(lines.get(1)
		                .contains("Molly"));
		assertTrue(lines.get(1)
		                .contains("Scarlett"));
		assertTrue(lines.get(1)
		                .contains("Joan"));
		assertTrue(lines.get(2)
		                .contains("Strikers are ["));
		assertTrue(lines.get(2)
		                .contains("Alex"));
		assertTrue(lines.get(2)
		                .contains("Johan"));
		assertTrue(lines.get(3)
		                .contains("Goalie is"));
		assertTrue(lines.get(3)
		                .contains("Alice"));

	}
}