package pp2017;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TeamTest
{

	@Test
	public void testToString()
	{
		Team myTeam = new Team();
		assertEquals("Team  has the following players:\n", myTeam.toString());
	}


	@Test
	public void proofThatPassedReferencesAreADodgyBusiness()
	{
		// Initialise and test the Team
		Team bestTeam = new Team();
		bestTeam.setNumOfPlayers(2);

		// Create a variable that references the players array
		Player[] dreamTeam = bestTeam.getPlayers();
		// make 'local' changes
		dreamTeam[0] = new Player("Test1");
		dreamTeam[1] = new Player("Test2");

		// class inner array has been changed.
		assertEquals(
				"Team  has the following players:\nPlayer: Test1 has scored 0 goals this season\nPlayer: Test2 has scored 0 goals this season\n",
				bestTeam.toString());
	}
}