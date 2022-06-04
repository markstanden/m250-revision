package pp2015;

import java.util.*;
import java.util.stream.Collectors;

public class FootballClub
{
	private final Map<String, String> players;


	private List<Integer> formation;


	public FootballClub()
	{
		players = new HashMap<>();
		formation = new ArrayList<>();
	}


	public void populate()
	{
		players.put("Anton", "striker");
		players.put("Rob", "goalie");
		players.put("Sue", "striker");
	}


	public List<Integer> getFormation()
	{
		return formation;
	}


	/**
	 * @param formationString
	 * 		is the required formation as a String, eg "4-3-3"
	 */
	public void setFormation(String formationString)
	{
		formation = Arrays.stream(formationString.split("-"))
		                  .mapToInt(Integer::parseInt)
		                  .boxed()
		                  .toList();
	}


	public void addPlayer(String name, String pos)
	{
		players.put(name, pos);
	}


	public String selectGoalie()
	{
		return players.keySet()
		              .stream()
		              .filter(player -> players.get(player)
		                                       .equals("goalie"))
		              .findFirst()
		              .orElse("Not Found");
	}


	private Set<String> getPlayers(int required, String position)
	{
		return players.keySet()
		              .stream()
		              .filter(name -> players.get(name)
		                                     .equals(position))
		              .limit(required)
		              .collect(Collectors.toSet());
	}


	public Set<String> selectDefenders()
	{
		return getPlayers(formation.get(0), "defender");
	}


	public Set<String> selectMidfielders()
	{
		return getPlayers(formation.get(1), "midfielder");
	}


	public Set<String> selectStrikers()
	{
		return getPlayers(formation.get(2), "striker");
	}


	public void teamPrintout()
	{
		System.out.println("Defenders are " + selectDefenders());
		System.out.println("Midfielders are " + selectMidfielders());
		System.out.println("Strikers are " + selectStrikers());
		System.out.println("Goalie is " + selectGoalie());
	}
}