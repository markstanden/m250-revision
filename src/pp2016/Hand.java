package pp2016;

import java.util.ArrayList;
import java.util.List;

public class Hand
{
	List<String> cards;


	public Hand()
	{
		cards = new ArrayList<>();
	}


	/**
	 * removes and returns the first
	 * card (represented by a string) in the hand
	 *
	 * @return string representing first card in the hand
	 */
	public String getCard()
	{
		return cards.remove(0);
	}


	/**
	 * add string argument representing a card to the hand
	 *
	 * @param card
	 * 		string representing card to be added to the hand
	 */
	public void addCard(String card)
	{
		cards.add(card);
	}


	/**
	 * Returns the number of cards (strings)
	 * in the hand.
	 *
	 * @return int Size of the hand.
	 */
	public int getSize()
	{
		return cards.size();
	}
}