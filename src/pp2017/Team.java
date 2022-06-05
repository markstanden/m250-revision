package pp2017;

public class Team
{
	private final int MAX_PLAYERS;
	private Player[] players;
	private int numOfPlayers; //number of players in the array
	private String name;

	public Team(){
		MAX_PLAYERS = 11;
		players = new Player[MAX_PLAYERS];
		numOfPlayers = 0;
		name = "";
	}
}