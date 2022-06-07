package pp2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Deck
{
	// List chosen as order is important,
	// Set might be appropriate as cards are unique.


	private List<String> cards;


	/**
	 * ii.
	 */
	public Deck()
	{
		cards = new ArrayList<>();
	}


	/**
	 * iii.
	 */
	public void addCard(String card)
	{
		//cards.add("S10");
		cards.add(card);
	}


	/**
	 * iv.
	 */
	public void randomOrder()
	{
		Collections.shuffle(cards);
	}


	/**
	 * v.
	 */
	public String dealCard()
	{
		return cards.remove(0);
	}


	/**
	 * Creates a new Deck instance and populates
	 * it with a standard 52 card pack of cards.
	 */
	public static Deck fullDeck()
	{
		Deck full = new Deck();
		Set<String> deck = Deck.createStandardDeck();
		deck.forEach(full::addCard);
		return full;
	}


	/**
	 * Creates a standard 52 card deck
	 *
	 * @return Set of the 52 cards in a standard deck.
	 */
	public static Set<String> createStandardDeck()
	{
		List<String> suits = List.of("S", "H", "C", "D");
		List<Integer> values = IntStream.range(1, 14)
		                                .boxed()
		                                .toList();
		return suits.stream()
		            .parallel()
		            // Stream of suits...  S... H... C... D...
		            .flatMap(suit -> values.stream()
		                                   .parallel()
		                                   // Stream of values for each suit
		                                   // S... 1, 2, 3, 4...
		                                   .map(value -> suit.concat(value.toString())))
		            .collect(Collectors.toSet());
	}


	/**
	 * for testing
	 */
	public List<String> getCards()
	{
		return List.copyOf(cards);
	}
}